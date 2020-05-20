package day5.newarray;

public class ArrayMethod {
    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 9, 33, 2, 8, 100, 6, 99};
        System.out.println(array1.length);
        System.out.println(array1);
//        array1 = new int[3];
//        System.out.println(array1.length);
//        array1[0] = 1;
//        array1[1] = 2;
//        System.out.println(array1);
        for (int i = 0; i < 10; i++) {
            System.out.println(array1[i]);
        }

        for (int i = 0; i < array1.length; i++) {

        }
        for (int i : array1) {
            System.out.println(i);
        }
        for (int i = array1.length - 1; i >= 0; i--) {

        }



    }
}
