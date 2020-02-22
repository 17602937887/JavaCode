package code.RedMoney;

import java.util.ArrayList;

public class Manager extends user{
    public Manager() {
    }

    public Manager(String name, int num) {
        super(name, num);
    }

    public ArrayList<Integer> send(int all, int num)
    {
        ArrayList<Integer> val = new ArrayList<>();

        if(all > super.getNum())
        {
            System.out.println("老板的钱不够, 不发了");
            for(int i = 0; i < num; i++)
                val.add(0);
            return val;
        }
        setNum(super.getNum() - all);
        System.out.println("老板的钱足够,发");
        for(int i = 0; i < num; i++)
        {
            val.add(all / num);
        }
        val.set(num - 1, val.get(num - 1) + all % num);
        return val;
    }
}
