package code.February22th.Demo02;

public class TestSpeed {
    public static void main(String[] args) {
        int time = 10000000;
        int cnt = 0;
        long start = System.currentTimeMillis();
        while((time--) != 0){
            cnt++;
        }
        long end = System.currentTimeMillis();
        System.out.println("Time = " + (end - start) + " ms");
    }
}
