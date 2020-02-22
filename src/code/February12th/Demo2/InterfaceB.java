package code.February12th.Demo2;

public interface InterfaceB {

    public abstract void methodA();

    public default void methodB(){
        System.out.println("B接口的默认方法");
    }
}
