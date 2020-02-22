package code.February6th;

public class Demo02 {
    public static void main(String[] args) {
        Fu fu = new Fu();
        System.out.println("父类对象:" + fu.numFu);

        Zi zi = new Zi();
        System.out.println("子类对象: " + zi.numFu + "  +  " + zi.numZi);
        C c = new C();
        c.show();
    }
}
