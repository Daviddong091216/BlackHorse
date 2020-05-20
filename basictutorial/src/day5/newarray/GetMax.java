package day5.newarray;

public class GetMax {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 9, 33, 2, 8, 100, 6, 99};
        int[] sortArr = new int[arr.length];

        int max = arr[0];
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        sortArr[j] = max;
        System.out.println(max);

    }
}
