package code.February12th.Demo03;

public class Zi extends Fu{
    int a = 20;

    @Override
    public void method(){
        System.out.println("实现类方法执行!!");
    }

    public void methodZi(){
        System.out.println("子类特有方法");
    }
}
