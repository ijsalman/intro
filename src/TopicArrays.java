import java.util.Arrays;
import java.util.Scanner;

public class TopicArrays {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String [] name = new String [3];

        System.out.print("Please enter your first name: ");
        name[0] = keyboard.nextLine();

        System.out.print("Please enter your middle name: ");
        name[1] = keyboard.nextLine();

        System.out.print("Please enter your last name: ");
        name[2] = keyboard.nextLine();

        System.out.println(Arrays.toString(name));

        // Ibrahim J Salman
        // JSI

        String username = name[1].charAt(0) + "" + name[2].charAt(0) + name[0].charAt(0);

        System.out.println("Username: " + username);

        //System.out.println("PLease enter your first name: ");


        /*
        String[] name = {"Ibrahim", "J", "Salman"};

        //System.out.println(Arrays.toString(name));

        String fullName = name[0] + " " + name[1] + " " + name[2];

        System.out.println("Hi " + name[0] + ", We would love to welcome the " + name[2] + " family to the dinner hosted tomorrow!");

         */
    }
}
