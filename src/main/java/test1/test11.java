package test1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class test11 {
    public static void main(String[] args) {
        BigDecimal  decimal =  new BigDecimal("-2.3");
        BigDecimal  decimal2 = new BigDecimal("4");

//        BigDecimal decimal13 = decimal.multiply(decimal2);
        decimal = decimal.subtract(decimal2);
        System.out.println(decimal.compareTo(BigDecimal.ZERO));


//        List<String> list1  = new ArrayList<>();  list1.add("a");list1.add("b");list1.add("c");list1.add("d");
//        List<String> list2  = new ArrayList<>();list2.add("a");list2.add("b");list2.add("c");
//        list1.removeAll(list2);
//        System.out.println(list1);



    }
}
