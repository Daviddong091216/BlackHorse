package day10.Usb;

public class Mouse implements USB {
    @Override
    public void open() {
        System.out.println("Open mouse.");
    }

    @Override
    public void close() {
        System.out.println("Shut down mouse.");
    }

    public void click() {
        System.out.println("Mouse click.");
    }
}
