package code.February26th.Demo01;

public class Main {
    public static void main(String[] args) {
        ThreadTest a = new ThreadTest("陈航");
        ThreadTest b = new ThreadTest("王刚");
        a.start();
        b.start();
    }
}
