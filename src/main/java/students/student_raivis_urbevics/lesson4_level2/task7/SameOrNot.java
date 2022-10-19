package students.student_raivis_urbevics.lesson4_level2.task7;

import java.util.Scanner;

public class SameOrNot {
    public static void main(String[] args) {
        System.out.println("Input the first number");
        System.out.println("Input the second number");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        if (number1 == number2) {
            System.out.println("Numbers are equals");
        } else if (number1 != number2) {
            System.out.println("Numbers are different");

        }
    }
}


