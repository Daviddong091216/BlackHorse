package day10.Usb;

public class Computer {
    public void powerOn() {
        System.out.println("Open the computer.");
    }

    public void powerOff() {
        System.out.println("Shut down the computer.");
    }

    public void useDevice(USB usb) {
        usb.open();
        if(usb instanceof Mouse) {
            Mouse mouse = (Mouse) usb;
            mouse.click();
        } else if (usb instanceof Keyboard) {
            Keyboard keyboard = (Keyboard) usb;
            keyboard.type();
        }
        usb.close();
    }
}
