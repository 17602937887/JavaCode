package code.February25th.Demo01;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionsTest {
    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.parse("2020-12-2"));
        throw new Exception();
    }
}
