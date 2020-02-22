package code.February20th.Demo01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Test01 {

    public static void show(Collection<?> a){
        System.out.println(a);
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);

        show(a);
        HashSet<String> s = new HashSet<>();
        s.add("string、");
        s.add("拆开的时间和卡拉");
        show(s);
    }
}