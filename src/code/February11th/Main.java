package code.February11th;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Cat();
        if(animal instanceof Cat){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
