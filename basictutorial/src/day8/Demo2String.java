package day8;

public class Demo2String {
    public static void main(String[] args) {
        String str1 = "aa,bb,cc";
        String[] array1 = str1.split(",");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        String str2 = "hohoh";
        String[] array2 =str2.split("o");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
        System.out.println("The number of 'o': " + (array2.length -1));
    }
}
