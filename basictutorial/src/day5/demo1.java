package day5;

public class demo1 {
    public static void main(String[] args) {
        int[] arrayA = new int[3];
        String[] arrayB = new String[] {"aa", "bb", "cc"};
        int[] arrayC = { 1, 2, 3 };
        int[] arrayD;
        //arrayD = {1,2,3};
        arrayD = new int[] {10, 20, 30};
        int[] arrayE;
        arrayE = new int[] {1,2,3};

        int[] numArray2 = new int[3];
        numArray2[0] = 1;
        int[] numArray4;
        numArray4 = new int[] {1,2,3};


        int num1 = arrayC[0];
        System.out.println(arrayA[0]);
        System.out.println(num1);
        System.out.println(arrayC[1]);
        System.out.println(arrayD[2]);
    }
}
