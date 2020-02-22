package code.February6th;

public class C extends B{
    int num = 300;
    public void show(){
        int num = 400;
        System.out.println("方法内num = " + num);
        System.out.println("类内num = " + this.num);
        System.out.println("父类的num = " + super.num);
    }
}
