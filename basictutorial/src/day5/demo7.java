package day5;

public class demo7 {
    public static void main(String[] args) {
        int[] array1 = {1,3,66,-1, 99, 199, 5, -10};
        int maxNumber = getMax(array1);
        System.out.println(maxNumber);
        System.out.println(getMin(array1));

    }
    public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] > max) {
            max = array[i];
            }
        }
        return max;
    }
    public static int getMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
