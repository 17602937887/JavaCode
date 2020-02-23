package code.February23th.Demo02;

import code.February7th.Demo04.People;

import java.util.HashSet;
import java.util.Iterator;

public class PersonSetTest {
    public static void main(String[] args) {
        HashSet<Person> set = new HashSet<>();
        Person[] a = new Person[10];
        a[0] = new Person("陈航", 23, "man");
        a[1] = new Person("陈航", 23, "man");
        a[2] = new Person("小龙女", 21, "woman");
        a[3] = new Person("杨过", 18, "man");
        a[4] = new Person("杨过儿", 18, "man");

        for(int i = 0; i < 10; i++){
            if(a[i] != null){
                set.add(a[i]);
            }
        }

        Iterator<Person> iterator = set.iterator();
        while(iterator.hasNext()){
            Person tmp = iterator.next();
            System.out.println("name = " + tmp.getName() + "  age = " + tmp.getAge() + "  sex = " + tmp.getSex());
        }
    }
}
