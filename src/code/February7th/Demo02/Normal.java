package code.February7th.Demo02;

import java.util.ArrayList;
import java.util.Random;

public class Normal extends User {

    public Normal() {
    }

    public Normal(String name, int money) {
        super(name, money);
    }

    public void get(ArrayList<Integer> val, int cnt){
        int index = new Random().nextInt(cnt);
        this.setMoney(this.getMoney() + val.get(index));
        val.remove(index);
    }
}
