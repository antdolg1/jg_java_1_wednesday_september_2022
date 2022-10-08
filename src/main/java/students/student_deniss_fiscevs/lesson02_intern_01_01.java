package students.student_deniss_fiscevs;

import java.util.Scanner;

public class lesson02_intern_01_01 {
    public static void main(String[] args) {

        System.out.println("Hello, please, enter one by one, two simple numbers!");
        Scanner myScanner = new Scanner(System.in);
        int userFirstNumber = myScanner.nextInt();

        System.out.println("First number is " + userFirstNumber + ", and what is the second?");
        Scanner myScanner2 = new Scanner(System.in);
        int userSecondNumber = myScanner2.nextInt();

        System.out.println("Second number is " + userSecondNumber + ". So, here is whet we can do with them:");
        System.out.println("________________________");

        int add = userFirstNumber + userSecondNumber;
        int subtrac = userFirstNumber - userSecondNumber;

        System.out.println("Addition = " + add);
        System.out.println("Subtraction = " + subtrac);
        System.out.println("Entitlement = " + userFirstNumber * userSecondNumber);
        System.out.println("Division = " + userFirstNumber / userSecondNumber);

    }
}
