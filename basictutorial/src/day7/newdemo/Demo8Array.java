package day7.newdemo;

public class Demo8Array {
    public static void main(String[] args) {
        String[] str = {"aa", "bb", "cc"};
        System.out.println(str);
        Person[] array = new Person[3];

        Person one = new Person("Ethan", 11);
        Person two = new Person("Miley", 8);
        Person three = new Person("Aaron", 4);

        array[0] = one;
        array[1] = two;
        array[2] = three;
        System.out.println(array);

//        System.out.println(array[0].getName());
//        System.out.println(array);
//        System.out.println(one);
//        System.out.println(array[0]);
//
//        array[0].setAge(12);
//        System.out.println(array[0]);
//        System.out.println(array[0].getAge());
    }


}
