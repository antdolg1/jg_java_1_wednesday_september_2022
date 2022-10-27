package students.student_maksims_cerkasovs.lesson_2.level_3;

import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first number: ");
        double userNumber1 = scanner.nextDouble();
        System.out.println("Input the second number: ");
        double userNumber2 = scanner.nextDouble();
        System.out.println("Input the third number: ");
        double userNumber3 = scanner.nextDouble();

        double number1 = userNumber1 + userNumber2 + userNumber3;
        System.out.println("Arithmetic average = " + number1 / 3);

    }

}
