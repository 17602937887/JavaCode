package code.February22th.Demo01;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {
    private String name = "陈航";
    private int age = 0;

    public Employee() {
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        System.out.println("Employee: " + "  this.getClass() = " + getClass() + " o.getClass() = " + o.getClass());
        Employee employee = (Employee) o;
        System.out.println("Employee: employee.getClass() = " + o.getClass());
        return age == employee.age &&
                Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    /*@Override
    public boolean equals(Object other){
        if(this == other)
            return true;
        if(other == null || other.getClass() != this.getClass())
            return false;
        Employee otherEmployee = (Employee) other;
        return Objects.equals(this, otherEmployee) && this.age == otherEmployee.age && Objects.equals(this.date, otherEmployee.date);
    }*/

}
