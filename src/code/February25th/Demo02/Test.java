package code.February25th.Demo02;

import java.nio.file.FileAlreadyExistsException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Objects;

public class Test {
    public static void main(String[] args) throws ParseException, FileAlreadyExistsException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(simpleDateFormat.parse("2020-12-2"));
        Person[] a = new Person[3];
        a[0] = new Person("陈航", 23);
        a[2] = new Person("小龙女", 21);
        for(int i = 0; i < a.length; i++){
            try {
                Objects.requireNonNull(a[i], "空指针异常");
            } catch (Exception e){
                System.out.println(e);
            }
            System.out.println(a[i]);
        }

        readFile("d:\\a.txt");
    }

    public static int getElement(int[] arr, int index) {
        if (arr == null) {
            throw new NullPointerException("空指针异常");
        }
        if (index < 0 || index > arr.length - 1) {
            throw new ArrayIndexOutOfBoundsException("数组越界异常");
        }
        return arr[index];
    }

    public static void readFile(String fileName) throws FileAlreadyExistsException {
        if(!fileName.equals("c:\\a.txt")){
            throw new FileAlreadyExistsException("传递的文件路径不是c:\\a.txt");
        }
    }
}
