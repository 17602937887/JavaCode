package code.February21th.Demo03;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> link = new LinkedList<>();

        link.addFirst("abc1");
        link.addFirst("abc2");
        link.addFirst("abc3");

        System.out.println(link);
        link.add("abc4");
        System.out.println(link);
        link.push("abc5");
        System.out.println(link);

        System.out.println(link.getFirst());
        System.out.println(link.getLast());

        System.out.println(link.removeFirst());
        System.out.println(link);
        System.out.println(link.removeLast());
        System.out.println(link);


        System.out.println(link.remove());
        System.out.println(link);
        System.out.println(link.pop());
        System.out.println(link);
    }
}
