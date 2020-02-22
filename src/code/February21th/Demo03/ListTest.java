package code.February21th.Demo03;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("图图");
        list.add("小美");
        list.add("不高兴");

        System.out.println(list);

        list.add(1, "没头脑");

        System.out.println(list);

        System.out.println(list.remove(2));

        System.out.println(list);

        list.set(0, "三毛");

        System.out.println(list);

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println("==================");
        for(String it : list){
            System.out.println(it);
        }
    }
}
