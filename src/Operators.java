import java.util.Scanner;

public class Operators {
    public static void inBetween(int num, int a, int b) {
        // Make sure the number passed in is between the second and third parameter passed in and that the number is even

        boolean upper = num <= b;
        boolean lower = num >= a;
        boolean even = num % 2 == 0;

        if (upper && lower) {
            System.out.print(num + " is between " + a + " and " + b);
            if (even) {
                System.out.print(" and is an even number ");
                if (num % 4 == 0) {
                    System.out.print("and is divisible by 4");
                    if (num % 3 == 0) {
                        System.out.println(" and is divisible by 3");
                    } else {
                        System.out.println(" and is not divisible by 3");
                    }
                } else {
                    System.out.print("and is not divisible by 4");
                }
            } else {
                System.out.println(" and is an odd number");
            }
        }


        /*else if (upper && lower && !even) {
            System.out.println(num + " is between " + a + " and " + b + " and is an odd number");
        } else {
            System.out.println("Invalid number");
        }*/


        /*

        if (num >= a && num <= b && num % 2 == 0) {
            System.out.println(num + " is between " + a + " and " + b + " and is an even number");
        } else {
            System.out.println("Invalid number");
        }
*/


    }

    public static void main(String[] args) {
        // Those are inclusive operators
        int upperLimit = 99;
        int lowerLimit = 1;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a number to check if it is between the limits: ");
        int num = keyboard.nextInt();

        inBetween(num, lowerLimit, upperLimit);

    }
}
