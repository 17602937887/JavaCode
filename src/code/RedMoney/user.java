package code.RedMoney;

public class user {
    private String name;
    private int num;

    //@todo 显示用户的姓名与余额
    public void show()
    {
        System.out.println("我叫: " + name + " 我的金钱数为: " + num);
    }

    public user() {
    }

    public user(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
