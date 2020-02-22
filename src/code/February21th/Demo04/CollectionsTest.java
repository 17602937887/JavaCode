package code.February21th.Demo04;

import java.util.*;

public class CollectionsTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "cba", "aba", "sba", "nba");

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                return t1.charAt(0) - s.charAt(0);
            }
        });
        System.out.println(list);

        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0; i < 10; i++)
            a.add(i);
        System.out.println(a);
        Collections.sort(a, new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                return t1 - integer;
            }
        });
        System.out.println(a);
    }
}
