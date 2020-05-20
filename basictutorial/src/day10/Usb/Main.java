package day10.Usb;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.powerOn();

        Mouse mouse = new Mouse();
        USB usbMouse = mouse;
        computer.useDevice(usbMouse);

        Keyboard keyboard = new Keyboard();
        computer.useDevice(keyboard);

        computer.powerOff();
    }
}
