package code.RedMoney;

import java.util.ArrayList;
import java.util.Random;

public class Member extends user{
    public Member() {
    }

    public Member(String name, int num) {
        super(name, num);
    }

    public void change(ArrayList<Integer> a)
    {
        Random k = new Random();
        int index = k.nextInt(a.size());
        int val = a.remove(index);
        setNum(getNum() + val);
    }
}
