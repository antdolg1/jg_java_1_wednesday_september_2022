package students.student_stivens_veveris.lesson2;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        int userNumber1;
        int userNumber2;

            Scanner scanner = new Scanner(System.in);
            System.out.println("Please, enter first number: ");
            userNumber1 = scanner.nextInt();
            System.out.println("______________");
            System.out.println("User entered number: " + userNumber1);

            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Please, enter second number: ");
            userNumber2 = scanner.nextInt();
            System.out.println("______________");
            System.out.println("User entered number: " + userNumber2);

        int substraction = userNumber1 - userNumber2;
        int summary = userNumber1 + userNumber2;
        int division = userNumber1 / userNumber2;
        int multiplication = userNumber1 * userNumber2;

            System.out.println("______________");
            System.out.println("Numbers summary: " + summary);
            System.out.println("Numbers subtraction: " + substraction);
            System.out.println("Numbers division: " + division);
            System.out.println("Numbers multiplication: " + multiplication);

    }
}
