package code.February12th;

public class KeyBoard implements USB {
    @Override
    public void open() {
        System.out.println("键盘设备打开!");
    }

    @Override
    public void close() {
        System.out.println("键盘设备关闭!");
    }

    public void write(){
        System.out.println("键盘输入!");
    }
}
