package code.February23th.Demo01;

import java.util.HashSet;
import java.util.Iterator;

public class StringBuilderTest {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("你好!");
        set.add("你好!!");
        set.add("你好!!!");
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
