package code.February14th.Demo01;

public class Manager extends Employee {
    private double bonus = 0;

    public Manager() {
    }

    public Manager(double bonus) {
        this.bonus = bonus;
    }

    public Manager(String name, double salary, int year, int month, int day, double bonus) {
        super(name, salary, year, month, day);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getSalary(){
        return this.bonus + super.getSalary();
    }
}
