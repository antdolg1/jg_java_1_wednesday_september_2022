package students.student_deniss_fiscevs;

import java.util.Scanner;

public class lesson02_junior_03_11 {

    public static void main(String[] args) {

        System.out.println("To calculate the average, enter three numbers: ");

        double userNumber1;
        Scanner myscanner1 = new Scanner(System.in);
        userNumber1 = myscanner1.nextDouble();

        double userNumber2;
        Scanner myscanner2 = new Scanner(System.in);
        userNumber2 = myscanner2.nextDouble();

        double userNumber3;
        Scanner myscanner3 = new Scanner(System.in);
        userNumber3 = myscanner3.nextDouble();

        double ave1 = (userNumber1 + userNumber2 + userNumber3);
        double ave2 = ave1 / 3;
        System.out.println("Average is: " + ave2);
    }
}
