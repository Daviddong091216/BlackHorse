package day5;

public class demo5 {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3 };
        System.out.println(array[0]);
        //System.out.println(array[3]);
        int[] array1;
        array1 = new int[3];
        array1 = new int[] { 1, 2, 3 };
        System.out.println(array1);
        System.out.println("========");
        int[] array2 = null;
        System.out.println(array2);
        //System.out.println(array2[0]);
        array2 = new int[3];
        System.out.println(array2);
        System.out.println(array2[0]);
        array2 = new int[] { 10, 20, 30 };
        System.out.println(array2);
        System.out.println(array2[0]);
        int[] array3 = new int[3];
        System.out.println(array3);


    }
}
