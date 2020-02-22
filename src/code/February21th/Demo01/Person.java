package code.February21th.Demo01;

public class Person<E> {
    private E name;

    public Person() {
    }

    public Person(E name) {
        this.name = name;
    }

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}
