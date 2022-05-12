import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("How many hours have your spent on the project? ");

        int hours = keyboard.nextInt();

        int minutesInHours = 60;

        System.out.println("You have spent " + (minutesInHours*hours) + " minutes on the project");


/*
        char c = 'c';
        double d = 44.9;
        System.out.println("The temp is " + d + c);
*/

/*
        boolean condition = true;

        System.out.println(condition);

*/

/*
        double a = 3.7;
        double b = 9.5;
        a = 99.4;
        b = a;
        double c = a + b;
        int goal = 200;
        double d = goal - c;
        int h = 5;
        String t = "t";

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(200 - c);
        System.out.println("a is equal to " + a + " and b is equal to " + b + " and a + b is equal to " + c + "and that is " + d + " away from " + goal);

 */
/*

        int a = 5;
        int b = 9;

        int c = a + b;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        */



        //int people = 45;

        //double module = 2.1;

        //System.out.println(people);
        //System.out.println(module);

        //System.out.println("Hello Kenzie Family! There are "+people+ " awesome people in this session!");
    }
}
