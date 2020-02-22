package code.February15th.Demo01;

import java.time.LocalDate;

public class Employee extends Person {

    private double salary = 0;
    private LocalDate date = LocalDate.now();

    public Employee(String name, double salary, int year, int month, int day){
        super(name);
        this.salary = salary;
        this.date = LocalDate.of(year, month, day);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String getDescription() {
        return String.format("an employee with a salary of $%.2f", salary);
    }

    public void raiseSalary(double byPercent){
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}
