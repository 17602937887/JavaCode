package code.February12th;

public class DemoMain {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.open();

        computer.useDevice(new Mouse());
        computer.useDevice(new KeyBoard());

        computer.close();
    }
}
