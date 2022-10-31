package students.student_deniss_fiscevs.lesson02.level_3_junior;

import java.util.Scanner;

public class Task_10 {

    public static void main(String[] args) {

        System.out.print("To calculate the circles perimeter and area, please, enter circle's radius: ");

        double userNumber;
        Scanner myScanner = new Scanner(System.in);
        userNumber = myScanner.nextDouble();

        double per = 2 * userNumber * Math.PI;
        System.out.println("Perimeter is: " + per);

        double area = userNumber * userNumber * Math.PI;
        System.out.println("Area is: " + area);

    }
}
