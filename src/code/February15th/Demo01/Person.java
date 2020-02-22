package code.February15th.Demo01;

/**
 * 定义抽象类 人类
 */
public abstract class Person {

    // 定义域
    private String name;

    // 构造方法
    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    // get 和 set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 抽象方法
    public abstract String getDescription();
}
