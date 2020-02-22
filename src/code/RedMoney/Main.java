package code.RedMoney;

import javafx.scene.control.RadioMenuItem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("陈航", 1000);
        Member one = new Member("曹博", 0);
        Member two = new Member("海哥", 0);
        Member three = new Member("伟哥", 0);

        //@todo 展示初始的情况
        manager.show();
        one.show();
        two.show();
        three.show();


        ArrayList<Integer> k = manager.send(100, 3);
        one.change(k);
        two.change(k);
        three.change(k);

        //@todo 展示最后的情况
        manager.show();
        one.show();
        two.show();
        three.show();
    }
}
