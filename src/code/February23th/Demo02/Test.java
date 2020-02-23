package code.February23th.Demo02;

import com.sun.source.tree.ArrayAccessTree;

import java.util.*;

public class Test {
    public static int add(int... arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("cba");
        a.add("aba");
        a.add("sba");
        a.add("nba");
        System.out.println(a);
        Collections.sort(a, new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                if(t1.charAt(0) < s.charAt(0))
                    return 1;
                return -1;
            }
        });
        System.out.println(a);

        HashMap<String, Integer> k = new HashMap<>();
        k.put("陈航", 23);
        k.put("李四", 24);
        k.put("王五", 25);

        Set<String> keys = k.keySet();
        for(String key : keys){
            System.out.println(k.get(key));
        }

        Set<Map.Entry<String, Integer>> entries = k.entrySet();
        for(Map.Entry<String, Integer> tmp : entries){
            System.out.println(tmp.getKey() + " " + tmp.getValue());
        }

    }
}
