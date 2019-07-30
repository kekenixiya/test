package test1;

import java.nio.channels.SelectionKey;
import java.util.HashMap;
import java.util.Map;

public class Test2 {
    public static void main(String[] args) {
       String REGEX_MOBILE = "^((13[0-9])|(14[0-9])|(15[0-9])|(16[0-9])|(17[0-9])|(18[0-9])|(19[8-9]))\\d{8}$";
//        int aa = 10;
//        if(aa++ == 10){
//
//            System.out.print("hhhhhh" + aa);
//        }
//
//        String str = "北京市/北京市/东城区";
//        int index = str.indexOf("/");
//
//        str.substring(0,index);
//        SelectionKey.OP_ACCEPT

        String phone = "16516532999";

        String testStr = "{\"success\":false,\"errCode\":\"FAIL\",\"info\":\"操作失败\"}";

        System.out.println("&&**=="+(!(testStr.contains("success")&&testStr.contains("true")) && !
                (testStr.contains("SUCCESS")&&testStr.contains("true"))));

        System.out.println("!@#==="+phone.matches(REGEX_MOBILE));

        System.out.println(null+"ssdfadfa");

//
//        System.out.println(2&3);
//        System.out.println(2&3);
//        Map map = new HashMap();
//        System.out.println(map.get("sss"));
    }
}
