package code.February13th.Demo03;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;

public class Local {
    private final StringBuilder str = new StringBuilder("123");
    private String name = "陈航";

    {
        System.out.println("非静态代码块执行！！");
    }

    static {
        System.out.println("静态代码块执行!!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void method(Local tmp){
        tmp.name = "张三";
    }

    public void show(){
        System.out.println(str.toString());
        str.append("456");
        System.out.println(str.toString());
    }

    public static void main(String[] args) {
        Local local = new Local();
        local.show();
    }
}
