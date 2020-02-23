package code.February12th.Demo01;

public interface Inter {

    /**
     * 抽象方法  需要实现类自己实现方法
     */
    public abstract void A();

    /**
     *  默认方法 实现类可以覆盖重写 override 也可以默认 将abstract 改为default即可
     */

    public default void B(){
        System.out.println("默认方法实现");
    }

    /**
     *  静态方法 供接口直接 . 调用 实现类无法调用
     */

    public static void C(){
        System.out.println("静态方法");
    }

    /**
     *  私有方法 抽取共同代码
     */
    default void D(){
        System.out.println("AAAA");
        System.out.println("BBBB");
    }

    public default void E(){
        System.out.println("E方法执行");
        D();
    }

    public default void F(){
        System.out.println("F方法执行");
        D();
    }
}
