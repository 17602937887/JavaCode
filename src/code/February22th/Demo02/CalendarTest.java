package code.February22th.Demo02;

import java.util.Calendar;

public class CalendarTest {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

        calendar.set(Calendar.YEAR, 2021);
        System.out.println(calendar.get(Calendar.YEAR));

        calendar.set(1998,9,29);
        System.out.println(calendar.get(Calendar.YEAR) + " " + calendar.get(Calendar.MONTH) + " " + calendar.get(Calendar.DATE));
        calendar.add(Calendar.YEAR, 22);
        System.out.println(calendar.get(Calendar.YEAR) + " " + calendar.get(Calendar.MONTH) + " " + calendar.get(Calendar.DATE));
    }
}
