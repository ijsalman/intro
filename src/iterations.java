import java.util.Arrays;
import java.util.Scanner;

public class iterations {
    public static void main(String[] args) {
        int[] arr = new int[5];

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a random number: ");
        int num = keyboard.nextInt();

       do {
            System.out.println(num);
            num /= 2;
       } while (num <= 1000 && num % 2 == 0);

       boolean even = num % 2 == 0;

       if (even == true) {
           System.out.println("This number is even");
       } else {
           System.out.println("This number is odd");
       }



/*
        ++i; // adds 1 to the value of i first
        --i; // subtracts 1 from the value of i first
        i++; // adds 1 to the value of i second
        i--; // subtract 1 from the value of i second

        i += 1; // adds 1 to the value of i
        i = i + 1; // adds 1 to the value of i

        i += 5;

        */



    }
}
