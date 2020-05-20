package day5.newarray;

public class ArrayReverse {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3,4,5};
//        int[] reverseArr = new int[arr.length];
//
//        for (int i = 0; i < arr.length; i++) {
//            reverseArr[arr.length-i-1] = arr[i];
//        }
//        for (int i : reverseArr) {
//            System.out.println(i);
//        }
/*
        for (int i = 0; i < arr.length; i++) {
            if (arr.length-i-1 > i) {
                int num = arr[i];
                arr[i] = arr[arr.length-i-1];
                arr[arr.length-i-1] = num;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int i : arr) {
            System.out.println(i);
        }*/

        for (int i = 0,j = arr.length-1; i < j; i++, j--) {
                int num = arr[i];
                arr[i] = arr[arr.length-i-1];
                arr[arr.length-i-1] = num;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int i : arr) {
            System.out.println(i);
        }

    }

}
