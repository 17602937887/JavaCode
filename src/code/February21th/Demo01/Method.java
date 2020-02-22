package code.February21th.Demo01;

public class Method {
    public static <E> void show(E e){
        System.out.println(e.getClass());
    }

    public static <E> void show2(E e){
        if(e instanceof Integer){
            System.out.println(e);
        } else if(e instanceof String){
            System.out.println(e + " e.length = " + ((String) e).length());
        }
    }

    public static void main(String[] args) {
        show(new String("ni好评"));
        show2("在吗");
        show2(123);
    }
}
