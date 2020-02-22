package code.February12th.Demo2;

public interface InterfaceA {

    public abstract void methodA();

    public default void methodB(){
        System.out.println("A接口的默认方法");
    }
}
