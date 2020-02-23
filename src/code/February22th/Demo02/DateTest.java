package code.February22th.Demo02;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());
        Date date1 = new Date(123123123);
        System.out.println(date1);
        System.out.println(date1.getTime());

        SimpleDateFormat k = new SimpleDateFormat("yyyy年MM月dd日");
        System.out.println(k.parse("2020年1月1"));
    }
}
