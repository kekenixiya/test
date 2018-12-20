package test1;

import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class SimpleMainTest {

    static class threadTask implements Runnable{

        private String threadNo ;
        private Simple simple11;

        public threadTask(String threadNo, Simple simple11) {
            this.threadNo = threadNo;
            this.simple11 = simple11;
        }

        @Override
        public void run() {
            try {
                System.out.println("当前线程自定义编号 "+threadNo+"线程开始运行");
                while (true){
                    //获取跑道
                    boolean bool = simple11.getSimple();
                    if (bool) {
                        System.out.println("当前线程自定义编号 "+threadNo+"获取资格");
//                        Thread.sleep(1000);
                        simple11.releaseLock(threadNo);
                        System.out.println("当前线程自定义编号 "+threadNo+"处理完成");
                        break;
                    }else{
                        Thread.sleep(100);
                    }
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) {
        Executor executor = Executors.newCachedThreadPool();
        Simple simple11 = new Simple();



        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
        }
         Simple simple = new Simple();

        for (int i = 0; i < 10; i++) {
            executor.execute(new threadTask("keke  "+i+"  hehe  ", simple11));
        }

    }
}
