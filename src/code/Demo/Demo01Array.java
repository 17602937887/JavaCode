package code.Demo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Demo01Array {
    public static void show(ArrayList<String> a)
    {
        System.out.print("{");
        for(int i = 0; i < a.size(); i++)
        {
            if(i != 0)
                System.out.print("@");
            System.out.print(a.get(i));
        }
        System.out.print("}");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> a = new ArrayList<>();
        a.add("陈航");
        a.add("曹博");
        a.add("海哥");
        show(a);
    }
}
