package code.February7th.Demo02;

import code.February6th.A;

import java.util.ArrayList;

public class Manager extends User {
    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int sum, int cnt){
        if(sum > this.getMoney()){
            System.out.println("钱不够，不发了");
            return null;
        } else {
            this.setMoney(this.getMoney() - sum);
            ArrayList<Integer> val = new ArrayList<>();
            int num = sum / cnt;
            for(int i = 0; i < cnt; i++){
                if(i == cnt - 1){
                    val.add(num + sum % cnt);
                } else {
                    val.add(num);
                }
            }
            return val;
        }
    }
}
