package students.student_deniss_fiscevs;

import java.util.Scanner;

public class lesson02_intern_01_02 {
    public static void main(String [] args) {

        System.out.println("Hello, please, enter one by one, two decimal numbers!");
        Scanner myScanner = new Scanner(System.in);
        double firstDoubleNumber = myScanner.nextDouble();

        System.out.println("First number is " + firstDoubleNumber + ", and what is the second?");
        Scanner myScanner2 = new Scanner(System.in);
        double secondDoubleNumber = myScanner2.nextDouble();

        System.out.println("Second number is " + secondDoubleNumber + ". So, here is whet we can do with them:");
        System.out.println("________________________");

        double add = firstDoubleNumber + secondDoubleNumber;
        double subtrac = firstDoubleNumber - secondDoubleNumber;
        double entit = firstDoubleNumber * secondDoubleNumber;
        double div = firstDoubleNumber / secondDoubleNumber;


        System.out.println("Addition = " + add);
        System.out.println("Subtraction = " + subtrac);
        System.out.println("Entitlement = " + entit);
        System.out.println("Division = " + div);
    }
}
