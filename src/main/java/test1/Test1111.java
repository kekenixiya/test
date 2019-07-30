package test1;

import com.aa.bb.DateUtil;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Test1111 {

    public static void main(String[] args) {
        String ss="2019-07-11";
        String sss="6:07:11";
//        System.out.println(DateUtil.convertStringToLDT(ss, "yyyy-MM-dd HH:mm:ss"));

//        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm:ss");
//        System.out.println(LocalDateTime.parse(sss, df));

        double mm = -34.56d;
        System.out.println(Math.abs(mm));
        int mmm = (int)mm;
        System.out.println(mmm);
//        BigDecimal.valueOf()
        String personPhoneOnlineMonth = "查询成功2年以上";

        System.out.println(personPhoneOnlineMonth.contains("查询成功"));
//
//        System.out.println(!personPhoneOnlineMonth.contains("不一致"));
    }
}
