package code.February21th.Demo02;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        a.add("陈航");
        a.add("wang1");
        a.add("asdad");

        b.add(123);
        b.add(456);
        show(a);
        show(b);
    }

    public static void show(ArrayList<?> val){
        for(int i = 0; i < val.size(); i++){
            System.out.println(val.get(i));
        }
    }
}
