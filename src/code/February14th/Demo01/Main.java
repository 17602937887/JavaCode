package code.February14th.Demo01;

import java.util.EnumMap;

public class Main {
    public static void main(String[] args) {
        Manager[] managers = new Manager[10];

        Employee[] staff = managers;

        staff[0] = new Employee("Harry Hacker", 10000, 1998, 9, 29);

        System.out.println(managers[0].getName() + " " + managers[0].getSalary());
    }
}
