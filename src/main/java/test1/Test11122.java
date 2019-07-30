package test1;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Test11122 {
    public static void main(String[] args) {
        Calendar c1 = Calendar.getInstance();
        c1.add(Calendar.MONTH,-6);
        Date date = c1.getTime();

        System.out.println(new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒").format(date));
        System.out.println(new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒").format(new Date()));

        System.out.println("==========================");
        Message message = new Message(); message.id = 111;message.name = "ssss";message.time=new Date();
        System.out.println(JSON.toJSONString(message));

        System.out.println("=============================");

        Date dates = new Date();
        System.out.println(dates);
        System.out.println(dates.getTime());

        Date date2 = new Date(dates.getTime() + (1000 * 60));
        System.out.println(date2);

        byte aa= 1;
        System.out.println("=============================");
        String sss = "123,123,";
        String[] ssss = sss.split(",");
        System.out.println();
        System.out.println("=============================");
        JSONObject  jsonObject = new JSONObject();
        jsonObject.put("aaa","1aaa");jsonObject.put("bbb","2bbb");
        System.out.println(jsonObject.toJSONString());

        Map map = new HashMap();map.put("aaa","1aaa");map.put("bbb","2bbb");
        System.out.println(JSON.toJSONString(map));
        System.out.println("=============================");

        System.out.println((new Date()).getTime());
        System.out.println(System.currentTimeMillis());
    }
}

class Message{
    Integer id;
    String  name;
    Date     time;

    public Date getTime() {
        return time;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

