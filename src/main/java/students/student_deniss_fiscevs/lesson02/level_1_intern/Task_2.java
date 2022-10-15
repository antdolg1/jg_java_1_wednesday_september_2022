package students.student_deniss_fiscevs.lesson02.level_1_intern;

import java.util.Scanner;

public class Task_2 {
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
