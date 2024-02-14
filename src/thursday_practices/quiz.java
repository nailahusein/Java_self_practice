package thursday_practices;

import java.util.Arrays;

public class quiz {

    public static void main(String[] args) {
//        String str = "Hello";
//        StringBuilder sb = new StringBuilder(str);
//        sb.append(" Cydeo");
//        str.concat(" Cydeo");
//
//        System.out.println(sb);
//        System.out.println(str);
//
//
//
//            String a = "Wooden Spoon";
//            String b = a.substring(0, a.indexOf(" "));
//
//            System.out.println(b);



//            String s1 = "abc";
//            String s2 = "abc";
//
//            System.out.println("s1 == s2 is: " + s1 == s2);


            int[] numbers = {10, 20, 30, 40, 50};

            System.out.println(numbers.length);
            System.out.println(numbers[numbers.length - 1]);




            char[] charArray1 = {'a', 'b', 'c', 'd', 'e'};
            char[] charArray2 = {'a', 'b', 'c', 'd', 'e'};

            System.out.println(charArray1 == charArray2);
            System.out.println(Arrays.equals(charArray1, charArray2));

    }
}
