package code.February19th.Demop02;

import java.util.ArrayList;

public class MainTest {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            a.add(i);
        }
        System.out.println(a);
        for(int i = 0; i < 3; i++){
            a.remove(0);
            System.out.println(a + " size = " + a.size());
        }
    }
}
