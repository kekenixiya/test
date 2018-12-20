package cn.com.nixiya;

import java.util.ArrayList;
import java.util.List;

public class Simple {
    private String id;
    private String name;
    private Integer age;

    public static void main(String[] args) {
//        List list1 =new ArrayList();
//        list1.add("1111");
//        list1.add("2222");
//        list1.add("3333");
//
//        List list2 =new ArrayList();
//        list2.add("3333");
//        list2.add("4444");
//        list2.add("5555");

        //并集
        //list1.addAll(list2);
        //交集
        //list1.retainAll(list2);
        //差集
//        list1.removeAll(list2);
        //无重复并集
//        list2.removeAll(list1);
//        list1.addAll(list2);

//
//        Integer ss = 7;
//
//        String ssss = "";
//
//        String[] aa = ssss.split(",");

//        String[]  cc = new String[0];

        String sortFild = "sort";


        String newStr=sortFild.substring(0, 1).toUpperCase()+sortFild.replaceFirst("\\w","");

        System.out.println(newStr);
    }
}
