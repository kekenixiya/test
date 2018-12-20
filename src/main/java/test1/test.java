package test1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test {
    public static void main(String[] args) {
            String datastr = "20189";

        SimpleDateFormat sDateFormat=new SimpleDateFormat("yyyymm");
        SimpleDateFormat sDateFormat1=new SimpleDateFormat("yyyymm");
        Date data = null ;
        Date data1 = null;
        try {
            data = sDateFormat.parse("20189");
            data1 = sDateFormat.parse("201809");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String ss = sDateFormat1.format(null);
        String ss1 = sDateFormat1.format(data1);
    }
}
