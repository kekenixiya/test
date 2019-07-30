package com.aa.bb;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class test11111 {
    public static void main(String[] args) throws ParseException {
//
//        String str = DateUtil.dateFormatTime(new Date(),DateUtil.DateMode_6);
//
//        System.out.println(str);

//        Calendar calendar = Calendar.getInstance();
//        calendar.setTime(new Date());
//        calendar.set(Calendar.HOUR_OF_DAY, 0);
//        calendar.set(Calendar.MINUTE, 0);
//        calendar.set(Calendar.SECOND, 0);
//        Date endDate = calendar.getTime();
//        System.out.println( DateUtil.dateFormatTime(endDate,DateUtil.DateMode_9));
//
//        calendar.add(Calendar.DATE, -1);
//        Date startDate = calendar.getTime();
//        System.out.println( DateUtil.dateFormatTime(startDate,DateUtil.DateMode_9));

//        String regex = "^20[0-2][0-9][0-1][0-9][0-3][0-9]$";
//        System.out.println("20190645".matches(regex));
//        SimpleDateFormat sDateFormat=new SimpleDateFormat("yyyyMMdd");
//        Date date = sDateFormat.parse("00190634");
//        System.out.println(DateUtil.dateFormatTime(date,DateUtil.DateMode_9));


        System.out.println(Integer.parseInt(DateUtil.dateFormatTime(new Date(), DateUtil.DateMode_6)));

    }
}
