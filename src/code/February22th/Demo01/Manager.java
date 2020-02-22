package code.February22th.Demo01;

import com.mysql.cj.jdbc.result.UpdatableResultSet;

import java.time.LocalDate;
import java.util.Objects;

public class Manager extends Employee {

    private String otherName = "";

    public Manager(String otherName) {
        this.otherName = otherName;
    }

    public Manager(String name, int age, String otherName) {
        super(name, age);
        this.otherName = otherName;
    }

    public String getOtherName() {
        return otherName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        System.out.println("Manage: " + "  this.getClass() = " + getClass() + " o.getClass() = " + o.getClass());
        if (!super.equals(o)) return false;
        Manager manager = (Manager) o;
        return Objects.equals(otherName, manager.otherName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), otherName);
    }

    public void setOtherName(String otherName) {
        this.otherName = otherName;
    }
}
