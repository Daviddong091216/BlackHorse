package day5;

public class demo9 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 6, 9, 100, 99, 66, 33};
        int[] newArray = reversedArray(array1);
        printArray(newArray);

    }
    public static int[] reversedArray(int[] array) {
        for (int min = 0, max = array.length-1; min < max; min++, max--) {
            int temp = array[min];
            array[min] = array[max];
            array[max] = temp;
        }
        return array;
    }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
