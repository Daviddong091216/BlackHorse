package day10.Usb;

public class Keyboard implements USB {
    @Override
    public void open() {
        System.out.println("Open the keyboard.");
    }

    @Override
    public void close() {
        System.out.println("Shut down the keyboard.");
    }
    public void type() {
        System.out.println("Keyboard input.");
    }
}
