package code.February13th;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        final LocalDate date = LocalDate.now();
        System.out.println(date);
        date.plusDays(1);
        System.out.println(date);
    }
}
