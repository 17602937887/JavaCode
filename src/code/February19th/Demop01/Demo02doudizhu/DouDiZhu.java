package code.February19th.Demop01.Demo02doudizhu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class DouDiZhu {
    public static void main(String[] args) {
        String[] colors = new String[]{"♠", "♥", "♦", "♣"};
        String[] numbers = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        ArrayList<String> poker = new ArrayList<>();
        for(String color : colors){
            for(String number : numbers){
                String val = color + number;
                poker.add(val);
            }
        }
        poker.add("大王");
        poker.add("小王");

        // 洗牌操作
        Collections.shuffle(poker);

        // 发牌操作
        ArrayList<String> user1 = new ArrayList<>();
        ArrayList<String> user2 = new ArrayList<>();
        ArrayList<String> user3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();

        for(int i = 0; i < poker.size() - 3; i++){
            if(i % 3 == 0){
                user1.add(poker.get(i));
            } else if(i % 3 == 1){
                user2.add(poker.get(i));
            } else {
                user3.add(poker.get(i));
            }
        }
        dipai.add(poker.get(poker.size() - 3));
        dipai.add(poker.get(poker.size() - 2));
        dipai.add(poker.get(poker.size() - 1));
        System.out.println("刘德华:" + user1.toString() + " size = " + user1.size());
        System.out.println("周润发:" + user2.toString() + " size = " + user2.size());
        System.out.println("周星驰:" + user3.toString() + " size = " + user3.size());
        System.out.println("底牌:" + dipai);
    }
}
