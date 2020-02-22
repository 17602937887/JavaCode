package code.February21th.Demo04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Collections.addAll(list, new Student("rose", 18), new Student("jack", 16), new Student("abc", 16), new Student("ace", 17), new Student("mark", 16));

        for(Student it : list){
            System.out.println("name: " + it.getName() + "  age: " + it.getAge());
        }

        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student student, Student t1) {
                if(student.getAge() != t1.getAge()){
                    return student.getAge() - t1.getAge();
                } else {
                    return student.getName().charAt(0) - t1.getName().charAt(0);
                }
            }
        });

        System.out.println("==============");

        for(Student it : list){
            System.out.println("name: " + it.getName() + "  age: " + it.getAge());
        }
    }
}
