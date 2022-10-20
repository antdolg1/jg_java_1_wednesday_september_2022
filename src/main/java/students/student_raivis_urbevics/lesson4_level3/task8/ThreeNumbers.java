package students.student_raivis_urbevics.lesson4_level3.task8;

import java.util.Scanner;

public class ThreeNumbers {
    public static void main(String[] args) {
        System.out.println("Input the first number");
        System.out.println("Input the second number");
        System.out.println("Input the third number");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        if (number1 == number2 && number1 == number3) {
            System.out.println("Numbers are equals");
        } else if (number1 != number2 && number1 != number3) {
            System.out.println("Numbers are different");
        }
    }
}










