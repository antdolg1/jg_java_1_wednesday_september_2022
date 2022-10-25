package students.student_maksims_cerkasovs.lesson_2.level_3;

import students.student_oleg_gryazev.Math;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the circle radius: ");
        double userNumber = scanner.nextDouble();

        double number1 = userNumber * userNumber;
        double pi = 3.1415;
        double number2 = 2 * userNumber;

        System.out.println("Perimeter is =" + pi * number1);
        System.out.println("Area is =" + pi * number2);

    }

}
