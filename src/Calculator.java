import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String welcome = "Welcome to Calculator!";
        System.out.println(welcome);

        boolean doMath = true;

        boolean firstTime = true;

        double result = 0; // include the result of the math operation

        String operations = "";

        do {
            System.out.println("ans = " + result + "\n1 - addition\n2 - subtraction\n3 - multiplication\n4 - division\n5 - quit");
            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("C U Soon!");
                doMath = false;
            } else {
                double a;
                if (firstTime) {
                    System.out.println("Enter the first number: ");
                    a = scanner.nextDouble();
                    firstTime = false;
                } else {
                    a = result;
                }
                operations += String.valueOf(a);

                System.out.println("Enter the second number: ");
                double b = scanner.nextDouble();

                switch (choice) {
                    case 1:
                        result = a + b;
                        operations += " + ";
                        break;
                    case 2:
                        result = a - b;
                        operations += " - ";
                        break;
                    case 3:
                        result = a * b;
                        operations += " * ";
                        break;
                    case 4:
                        result = a / b;
                        operations += " / ";
                        break;
                    default:
                        System.out.println("Invalid operation!");

                }
                operations += String.valueOf(b) + " = " + result + "\n";
            }
        } while(doMath);

        System.out.println(operations);

/*
        if (choice == 1) {

        }
        else if (choice == 2) {

        }
        else if (choice == 3) {

        }
        else if (choice == 4) {

        }
        else {
            System.out.println("Invalid operation!");
        }

*/

/*
        String welcome = "Welcome to Calculator!";
        System.out.println(welcome);

        System.out.print("What operation would you like to perform? addition/subtraction ");
        String choice = keyboard.nextLine();

        if (choice.equalsIgnoreCase("addition") || choice.equalsIgnoreCase("subtraction")) {
            System.out.println("Enter the first number: ");
            double a = keyboard.nextDouble();

            System.out.println("Enter the second number: ");
            double b = keyboard.nextDouble();

            if (choice.equalsIgnoreCase("addition")) {
                double sum = a + b;
                System.out.println(sum);
            }

            if (choice.equalsIgnoreCase("subtraction")) {
                double difference = a - b;
                System.out.println(difference);
            }
        } else {
            System.out.println("Incorrect operator!");
        }




        int i = 4;
        int j = 9;
        int k = 2;

        int v = mykeyboarddonttouch.nextInt();

        if (v == i) {
            System.out.println("first");
            System.out.println(i);
        }
        else if (v == j) {
            System.out.println("Second");
            System.out.println(j);

        }
        else if (v == k) {
            System.out.println("Third");
            System.out.println(k);
        }
        else {
            System.out.println("RIP");
        }


    */





    }
}
