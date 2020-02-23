package code.February8th.Demo04;

public interface Private1 {

    public default void show1(){
        System.out.println("默认方法1执行!!!");
        show();
    }

    public default void show2(){
        System.out.println("默认方法2执行");
        show();
    }

    default void show(){
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }

}
