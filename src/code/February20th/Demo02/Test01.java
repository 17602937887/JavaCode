package code.February20th.Demo02;

import java.text.ParseException;

public class Test01 {
    public static void main(String[] args) throws ParseException {
        long start = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++){
            System.out.print(' ');
        }
        long end = System.currentTimeMillis();
        System.out.println();
        System.out.println(end - start);
    }
}
