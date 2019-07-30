package test1;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.SimpleFormatter;

public class test112 {

    public static void main(String[] args) throws ParseException {
//        SimpleDateFormat sDateFormat= new SimpleDateFormat("yyyyMM");
//        Date nowDate  = sDateFormat.parse("201810");
//
//        Calendar calendar = Calendar.getInstance();
//        calendar.setTime(nowDate);
//        calendar.add(Calendar.MONTH, -1);
//        Date prevDate = calendar.getTime();
//
//        String prevStr = sDateFormat.format(prevDate);
//
//        Map<String,Integer> result = new HashMap<>();
//        result.put("month_now",Integer.parseInt(datestr));
//        result.put("month_prev",Integer.parseInt(prevStr));


//        SimpleDateFormat sDateFormat= new SimpleDateFormat("@yyyy@MM@dd@HH");
//
//        System.out.println(sDateFormat.format(new Date()));

//              Date date = new Date();
//              date.getDay();
//              System.out.println(date.getDate());

        boolean bool = true ;


        System.out.println( Boolean.TRUE.equals(bool));



//
//                Double double1 = 123456789.123456789;
//                DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");//格式化设置
//                System.out.println(decimalFormat.format(double1));
//                System.out.println(double1);

        System.out.println( System.currentTimeMillis());

        Date  date = new Date(System.currentTimeMillis()) ;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
        System.out.println(simpleDateFormat.format(date).trim());
    }
}
