package test1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test12 {

    public static void main(String[] args) {
        Date date  = new Date();
        System.out.println(date.getTime());

        String sss = "abcde";
        System.out.println(sss.substring(0,4)+"----");


        List<String>  list1 = new ArrayList<>(); list1.add("a");list1.add("b");list1.add("c");list1.add("d");
        List<String>  list2 = new ArrayList<>(); list2.add("d");list2.add("c");list2.add("g");

        boolean  bool = list1.retainAll(list2);
        System.out.println(bool);
        System.out.println(list1); System.out.println(list2);

    }
}
