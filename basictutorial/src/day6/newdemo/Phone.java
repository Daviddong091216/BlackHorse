package day6.newdemo;

public class Phone {
    String brand;
    double price;
    String color;

    public void call(String who) {
        System.out.println("call : " + who);
    }

    public void sendMessage() {
        System.out.println("Sending message.....");
    }
}
