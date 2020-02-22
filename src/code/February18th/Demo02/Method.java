package code.February18th.Demo02;

import java.time.LocalDate;

public class Method {
    public static <E> void method(E val){
        if(val instanceof Integer){
            System.out.println("Integer:" + val);
        } else if(val instanceof String){
            System.out.println("String:" + val);
        } else if(val instanceof LocalDate){
            System.out.println("LocalDate:" + val);
        }
    }
}
