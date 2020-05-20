package day8;

public class Demo1String {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        char[] charArray = {'a', 'b', 'c'};
        String str3 = new String(charArray);
        System.out.println(str1==str3);
        System.out.println(str2.equals(str3));
//        String str5 = null;
//        System.out.println("abc".equals(str5));
//        System.out.println(str5.equals("abc"));
        String str5 = str1.concat(str2);
        System.out.println(str5);
        char ch = "Hello".charAt(1);
        System.out.println(ch);
        int num = "Hello".indexOf("loo");
        System.out.println(num);
        String str = "Helloworld";
        String str6= str.substring(5);
        String str7= str.substring(1,5);
        System.out.println(str6);
        System.out.println(str7);
        String str8 = "Helloworld";
        char[] chars = str.toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars.length);
        System.out.println(str.length());
        byte[] bytes = str.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
        String str9 = "How do you do?";
        String str10 = str9.replace("o", "*");
        System.out.println(str10);



    }
}
