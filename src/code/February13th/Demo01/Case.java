package code.February13th.Demo01;

import java.time.*;

public class Case {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

        System.out.println("星期一 星期二 星期三 星期四 星期五 星期六 星期天");

        // 将date设置为当月的第一天  因为此日减去 today - 1 就变成了第一天
        date = date.minusDays(today - 1);

        // 获取当前天 是 这周的星期几
        DayOfWeek week = date.getDayOfWeek();

        int value = week.getValue();

        for (int i = 0; i < value; i++) {
            System.out.print("     ");
        }

        // 如果当前还是用一个月的话 就 打印
        while(date.getMonthValue() == month){
            System.out.printf("%5d", date.getDayOfMonth());

            // 判断当前打印的是不是今天
            if(date.getDayOfMonth() == today){
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            date = date.plusDays(1);
            if(date.getDayOfWeek().getValue() == 1){
                System.out.println();
            }
        }
    }
}
