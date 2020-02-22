package code.February7th.Demo02;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("陈航", 100);
        Normal people1 = new Normal("张三", 0);
        Normal people2 = new Normal("李四", 0);
        Normal people3 = new Normal("王五", 0);
        manager.show();
        people1.show();
        people2.show();
        people3.show();
        System.out.println("===============");
        ArrayList<Integer> val = manager.send(100, 3);
        if(val != null){
            people1.get(val,  val.size());
            people2.get(val,  val.size());
            people3.get(val,  val.size());
        }
        manager.show();
        people1.show();
        people2.show();
        people3.show();
    }
}
