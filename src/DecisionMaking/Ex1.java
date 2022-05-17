package DecisionMaking;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        
        // First Part of Ex1
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter your age in years: ");
        int ageInYears = keyboard.nextInt();
        
        // Second of Ex1
        int daysInAYear = 365;
        int hoursInADay = 24;
        int ageInDays = ageInYears * daysInAYear;
        int ageInHours = ageInDays * hoursInADay;


        // Third part of Ex1
        System.out.println("You're " + ageInDays + " days old and " + ageInHours + " hours old!");

        int futureYear = 2024;
        int dob = 2022;

        int first = futureYear - dob;
        int second = 4;

        String mesg = "You will be either " + String.valueOf(first) + " or " + String.valueOf(second) + " in " + futureYear;

        System.out.println(mesg);
    }
}
