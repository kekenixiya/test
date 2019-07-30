package test1;



import com.aa.bb.DateUtil;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.util.*;

public class TestLambda1 {
	

	static  List<Employee>  emps = Arrays.asList(
			new Employee(101, "张三", 18, 9999.99),
			new Employee(102, "李四", 59, 6666.66),
			new Employee(103, "王五", 28, 3333.33),
			new Employee(104, "赵六", 8, 7777.77),
			new Employee(105, "田七", 38, 5555.55)
	);

	public static void main(String[] args) throws ParseException {
//		emps.stream().map(e ->
//			return e.setName("sssss");
//		);
//		String time1 = "2019-7-19 09:38:56";
//		String pattern2 ="yyyy-M-dd HH:mm:ss";
		String time2 = "2019-07-19";
		String pattern2 ="yyyy-M-dd";
		DateTimeFormatter formatter = new DateTimeFormatterBuilder()
				.appendPattern(pattern2)
				.parseDefaulting(ChronoField.HOUR_OF_DAY, 0)
				.parseDefaulting(ChronoField.MINUTE_OF_HOUR, 0)
				.parseDefaulting(ChronoField.SECOND_OF_MINUTE, 0)
				.parseDefaulting(ChronoField.MILLI_OF_SECOND, 0)
				.toFormatter();
		LocalDateTime dateTime = LocalDateTime.parse(time2, formatter);
		Date date =  Date.from(dateTime.atZone(ZoneId.systemDefault()).toInstant());

		System.out.println(DateUtil.dateFormatTime(date,DateUtil.DateMode_4));

		System.out.println("========================");

		DateFormat DATEFORMAT = new SimpleDateFormat("yyyy-MM-dd");
		DateFormat TIMEFORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

				String time3 = "2019-7-19 09:38:56";

		System.out.println(TIMEFORMAT.parse(time3));

	}
}
