package code.February21th.Demo04;

import java.util.ArrayList;
import java.util.HashSet;

public class Solution {

    public boolean isUgly(int num) {
        if(num < 1)
            return false;
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 2; i * i <= num; i++){
            if(num % i == 0){
                a.add(i);
                while(num % i == 0){
                    num /= i;
                }
            }
        }
        if(num > 1)
            a.add(num);
        int Max = 0;
        for(int i = 0; i < a.size(); i++){
            Max = Math.max(Max, a.get(i));
        }
        if(Max > 5)
            return false;
        return true;
    }
}
