package students.student_deniss_fiscevs.lesson02.level_3_junior;

import java.util.Scanner;

public class Task_11 {

    public static void main(String[] args) {

        System.out.println("To calculate the average, enter three numbers: ");

        Scanner myScanner = new Scanner(System.in);
        double userNumber1 = myScanner.nextDouble();
        double userNumber2 = myScanner.nextDouble();
        double userNumber3 = myScanner.nextDouble();

        double ave1 = (userNumber1 + userNumber2 + userNumber3);
        double ave2 = ave1 / 3;
        System.out.println("Average is: " + ave2);
    }
}
