package students.student_maksims_cerkasovs;

import java.util.Scanner;

public class Lesson2Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first number: ");
        int userNumber1 = scanner.nextInt();
        System.out.println("Input the second number: ");
        int userNumber2 = scanner.nextInt();

        int addiction = userNumber1 + userNumber2;
        System.out.println("Addiction = " + addiction);

        int subtraction = userNumber1 - userNumber2;
        System.out.println("Subtraction = " + subtraction);

        int multiplication = userNumber1 * userNumber2;
        System.out.println("Multiplication = " + multiplication);

        int division = userNumber1 / userNumber2;
        System.out.println("Division = " + division);

    }
}
