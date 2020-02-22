package code.February18th.Demo02;

public class GenericClass<A, B, C> {
    private A name;
    private B age;
    private C date;

    public GenericClass() {
    }

    public GenericClass(A name, B age, C date) {
        this.name = name;
        this.age = age;
        this.date = date;
    }

    public A getName() {
        return name;
    }

    public void setName(A name) {
        this.name = name;
    }

    public B getAge() {
        return age;
    }

    public void setAge(B age) {
        this.age = age;
    }

    public C getDate() {
        return date;
    }

    public void setDate(C date) {
        this.date = date;
    }
}
