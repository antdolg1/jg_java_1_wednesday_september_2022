package students.student_deniss_fiscevs;

import java.util.Scanner;

public class lesson02_junior_03_10 {

    public static void main(String[] args) {

        System.out.print("To calculate the circles perimeter and area, please, enter circle's radius: ");

        double userNumber;
        Scanner myscanner = new Scanner(System.in);
        userNumber = myscanner.nextDouble();

        double per = 2 * userNumber * Math.PI;
        System.out.println("Perimeter is: " + per);

        double area = userNumber * userNumber * Math.PI;
        System.out.println("Area is: " + area);

    }
}
