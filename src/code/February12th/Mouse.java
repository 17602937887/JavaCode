package code.February12th;

public class Mouse implements USB {
    @Override
    public void open() {
        System.out.println("鼠标设备打开!");
    }

    @Override
    public void close() {
        System.out.println("鼠标设备关闭!");
    }

    public void clink(){
        System.out.println("鼠标点击!");
    }
}
