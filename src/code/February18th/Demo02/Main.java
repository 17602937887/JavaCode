package code.February18th.Demo02;

import code.RedMoney.Member;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        GenericClass<String, Integer, LocalDate> a = new GenericClass<>("陈航", 23, LocalDate.now());
        System.out.println(a.getName());
        System.out.println(a.getAge());
        System.out.println(a.getDate());
        Method.method("陈航");
        Method.method(123);
        Method.method(LocalDate.now());
    }
}
