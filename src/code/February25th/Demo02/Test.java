package code.February25th.Demo02;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        Person[] a = new Person[3];
        a[0] = new Person("陈航", 23);
        a[2] = new Person("小龙女", 21);
        for(int i = 0; i < a.length; i++){
            try {
                Objects.requireNonNull(a[i], "空指针异常");
            } catch (Exception e){
                System.out.println(e);
            }
            System.out.println(a[i]);
        }
    }
}
