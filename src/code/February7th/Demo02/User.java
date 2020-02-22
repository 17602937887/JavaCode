package code.February7th.Demo02;

public class User {
    private String name;
    private int money;

    public void show(){
        System.out.println("我叫" + this.getName() + " 我有" + this.getMoney() + "元");
    }

    public User() {
    }

    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
