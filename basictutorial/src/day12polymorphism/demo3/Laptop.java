package day12polymorphism.demo3;

public class Laptop {
    public void powerOn() {
        System.out.println("Open the laptop");
    }

    public void powerOff() {
        System.out.println("Close the laptop");
    }

    public void useDevice(USB usb) {
        usb.open();
        if (usb instanceof Mouse) {
            ((Mouse) usb).click();
        } else if (usb instanceof Keyboard) {
            ((Keyboard) usb).type();
        }

        usb.close();
    }


}
