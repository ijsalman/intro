import java.util.Arrays;

public class IntroToArrays {

    public static void toString(int[] theBlahArray) {
        System.out.print("[");
        for (int i = 0; i < theBlahArray.length; i++) {
            System.out.print(theBlahArray[i]);
            if (i == theBlahArray.length-1) {
                System.out.print("]");
            } else {
                System.out.print(", ");
            }
        }
    }

    public static void main(String[] args) {
       /* int a = 1;
        int b = 2;
        int c = 3, d = 4;
        */

        int[] arr = {15, 34, 73, 94, 44, 2, 0, 1};
        toString(arr);


        //double[] darr = {3.3, 4.2, 5.4};
        //String[] sarr = {"Hi", "Hello", "How"};

        // Blah blah blah

        //int size = darr.length;

        //System.out.println(size);
/*
        System.out.println("arr[2]: " + arr[2]);

        arr[2]                 =  arr[2] *    arr[2];
        // place where 73 is      73     *    73

        System.out.println("arr[2]: " + arr[2]);
 */


        /*
        System.out.println(arr[0]); // Print the first value in the array
        System.out.println(arr[size - 1]); // Print the last value in the array


         */

        /*
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

         */

    }
}
