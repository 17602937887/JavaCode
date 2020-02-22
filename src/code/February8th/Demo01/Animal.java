package code.February8th.Demo01;

public interface Animal {
    public abstract void eat();
    public default void sleep(){
        System.out.println("某个动物在睡觉!!!");
    }
}
