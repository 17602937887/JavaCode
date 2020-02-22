package code.February12th;

import java.security.Key;

public class Computer {
    public void open(){
        System.out.println("笔记本启动!!!");
    }

    public void close(){
        System.out.println("笔记本关闭!!!");
    }

    public void useDevice(USB usb){
        usb.open();

        if(usb instanceof Mouse){
            ((Mouse) usb).clink();
        } else if(usb instanceof KeyBoard){
            ((KeyBoard) usb).write();
        }

        usb.close();
    }
}
