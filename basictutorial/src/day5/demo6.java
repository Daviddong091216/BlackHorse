package day5;



public class demo6 {
    public static void main(String[] args) {
        int[] array1 = { 1, 2, 3};
        System.out.println(array1.length);
        String str = "kjsagdakjsk";
        System.out.println(str.length());
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.toCharArray()[i]);
        }
    }


}
