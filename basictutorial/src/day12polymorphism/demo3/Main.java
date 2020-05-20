package day12polymorphism.demo3;

public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.powerOn();
//        Mouse mouse = new Mouse();
//        mouse.open();
//        mouse.click();
//        mouse.close();
        USB usbMouse = new Mouse();
        laptop.useDevice(usbMouse);

        Keyboard keyboard = new Keyboard();
//        keyboard.open();
//        keyboard.type();
//        keyboard.close();

        laptop.useDevice(keyboard);

        laptop.powerOff();
    }


}
