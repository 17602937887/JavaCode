package code.February23th.Demo01;

public class SystemTest {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for(int i = 1; i <= 9999; i++){
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("time = " + (end - start) + "ms");

    }
}
