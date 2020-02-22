package code.February13th.Demo02;

import java.time.LocalDate;

public class Employee {

    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String n, double s, int year, int month, int day){
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }

    public String getName(){
        return name;
    }

}
