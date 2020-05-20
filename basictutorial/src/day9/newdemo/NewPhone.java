package day9.newdemo;

public class NewPhone extends Phone{
    @Override
    public void show() {
        super.show();
        System.out.println("show name:...");
        System.out.println("show picture:...");
    }
}
