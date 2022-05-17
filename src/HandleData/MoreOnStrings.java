package HandleData;

import java.util.Scanner;
import java.util.Arrays;

public class MoreOnStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Printing arrays

        String str = "Hello";

        //System.out.println(Arrays.toString(str));

        for (char c : str.toCharArray()) {
            System.out.print(c);
        }




/*
        String date = "5/17/2022";

        int monthEnds = date.indexOf('/');
        System.out.println(monthEnds);

        int dayEnds = date.indexOf('/', monthEnds + 1);
        System.out.println(dayEnds);

        System.out.println("Month: " + date.substring(0, monthEnds));

        System.out.println("Day: " + date.substring(monthEnds + 1, dayEnds));

        System.out.println("Year: " + date.substring(dayEnds + 1));

        System.out.print("Enter today's date MM/DD/YYYY: ");
        String date = scanner.nextLine();

        int monthEnds = date.indexOf('/');
        int dayEnds = date.indexOf('/', monthEnds + 1);

        String year, month, day;

        // Extracting the month
        month = date.substring(0, monthEnds);

        // Extracting the day
        day = date.substring(monthEnds + 1, dayEnds);

        // Extracting the year
        year = date.substring(dayEnds + 1);

        boolean isValid = true;

        if (Integer.valueOf(month) < 1 || Integer.valueOf(month) > 12) {
            isValid = false;
        }

        if (Integer.valueOf(day) > 31 || Integer.valueOf(day) < 1) {
            isValid = false;
        }

        if (isValid) {
            // Print the results
            System.out.println("Month: " + month);
            System.out.println("Day: " + day);
            System.out.println("Year: " + year);
        } else {
            System.out.println("The date input is not valid");
        }

 */


    }
}
