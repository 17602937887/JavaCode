package code.February8th.Demo01;

public class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼!!!!");
    }

    @Override
    public void sleep(){
        System.out.println("小猫在安静的睡觉!!!");
    }
}
