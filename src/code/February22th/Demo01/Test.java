package code.February22th.Demo01;

public class Test {
    public static void main(String[] args) {
        Manager a = new Manager("帅", 23, "陈航");
        Manager b = new Manager("帅", 23, "陈航");
        System.out.println(a.equals(b));
    }
}
