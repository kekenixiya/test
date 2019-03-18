package test1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;

/**
 * 申请软著代码复制删除注释和空行
 */
public class SourceExport {
    public static void main(String[] args) throws Exception {
        //文件读取路径
//        String path  = "D:\\work_pro\\kc-risk\\risk-web\\src\\main\\java\\cn\\kingcar\\risk\\web";
        String path  = "D:\\work_pro\\kc-risk\\risk-biz\\src\\main\\java\\cn\\kingcar\\risk\\biz\\service";
//        File dir = new File("D:\\gitlab\\kc-business\\business-web\\src\\main\\java\\cn\\kingcar\\business\\web");
        File dir = new File(path);
        //文件输出路径
        File target = new File("D:\\project1.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(target));

        StringBuffer sb = new StringBuffer();
        loopRead(dir, sb);
        write(sb.toString(), bw);
    }
    // 遍历文件夹下所有文件
    private static void loopRead(File dir, StringBuffer sb){
        File[] files = dir.listFiles();
        String fileName = "";
        String suffix = "";
        if (files!=null)
        for(File file:files){
            fileName = file.getName();
            suffix = fileName.substring(fileName.lastIndexOf(".") + 1);
            System.out.println(fileName + "," + suffix);

            if(file.isDirectory()){
                loopRead(file, sb);
            }else {
                if(!suffix.equals("java")){
                    continue;
                }
                if(file.length()!=0){
                    sb.append(readFileToString(file));
                }
            }

        }

    }
    //读取文件里面的内容
    private static String readFileToString(File file){
        BufferedReader br = null;
        StringBuilder sb = new StringBuilder();
        try {
            br = new BufferedReader(new FileReader(file));
            String line = null;
            while((line = br.readLine())!=null){
                String s = line.trim();
                if (s.length()==0) {
                    continue;
                }
               /* if (s.startsWith("/") || s.startsWith("*")) {
                    continue;
                }*/
                sb.append(line).append("\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                if(br!=null){
                    br.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return sb.toString();

    }
    //将读取的路径以及相应的内容写入指定的文件
    private static void write(String str, Writer writer){
        try {
            writer.write(str);
        } catch (Exception e) {
            e.printStackTrace();
        }finally{

            try {
                if(writer!=null)
                    writer.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

    }
}
