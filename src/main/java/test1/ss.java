package test1;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ss {
    public static void main(String[] args) {

//        Boolean bool = (Boolean)null;
//
//        String line = "222225555";
//        String pattern = "^[1-9]\\d*$";
//        Pattern r = Pattern.compile(pattern);
//        Matcher m = r.matcher(line);
//        System.out.println(m.matches());
        List<Integer> list = new ArrayList<>(); list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);

        List<Integer> list2 = new ArrayList<>(); list2.add(1);list2.add(2);

//        List<Integer> list3 = new ArrayList<>(); list.add(1);list.add(2);list.add(3);list.add(4);

        list.removeAll(list2);
        System.out.println(list);
        System.out.println(list2);
        System.out.println("=======================================================");
        list2.add(3);list2.add(4);
        list.removeAll(list2);
        System.out.println(list);
        System.out.println(list2);

    }
}
