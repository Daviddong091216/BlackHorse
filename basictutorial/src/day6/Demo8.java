package day6;

public class Demo8 {
    public static void main(String[] args) {
        int[] array = { 1, 2, 5, 22, 2, 1, 99 };
        String[] array1 = { "aa", "bb", "abc"};
        //String max = getMax(array1);
        int max = getMax(array);
        System.out.println(max);


    }
    public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
//    public static String getMax(String[] array) {
//        String max = array[0];
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] > max) {
//                max = array[i];
//            }
//        }
//        return max;
//    }
}
