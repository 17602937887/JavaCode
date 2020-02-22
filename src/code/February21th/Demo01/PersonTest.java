package code.February21th.Demo01;

public class PersonTest extends Person<String>{

    public static void main(String[] args) {
        Person<String> stringPerson = new Person<>();
        stringPerson.setName("陈航");
        System.out.println(stringPerson.getName());

        Person<Integer> integerPerson = new Person<>();
        integerPerson.setName(123);
        System.out.println(integerPerson.getName());
    }
}
