package code.February25th.Demo01;

public class ThrowTest {
    public static void main(String[] args) {
        int[] a = null;
        try{
            int test1 = getElement(a, 0);
        } catch (Exception e){
            System.out.println(e);
        }
        a = new int[]{1, 2, 3};
        int test2 = getElement(a, 1);
        System.out.println(test2);
        int test3 = getElement(a, 4);
        System.out.println(test3);
    }
    public static int getElement(int[] arr, int index){
        if(arr == null){
            throw new NullPointerException("数组为null");
        } else if(arr.length - 1 < index){
            throw new ArrayIndexOutOfBoundsException("下标太大了");
        }
        return arr[index];
    }
}
