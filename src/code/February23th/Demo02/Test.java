package code.February23th.Demo02;

import com.sun.source.tree.ArrayAccessTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

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
    }
}
