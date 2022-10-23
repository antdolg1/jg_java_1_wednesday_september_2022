package students.student_stivens_veveris.lesson4.level2;

import java.util.Scanner;

public class Numbers7 {

    public static void main(String[] args) {

        System.out.println("Please input first whole number:");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println("Please input second whole number:");
        int number2 = scanner.nextInt();

        if (number == number2) {
            System.out.println("Numbers are equals");
        } else if (number != number2) {
            System.out.println("Numbers are different ");
        }
    }
}
