package students.student_sergejs_kozinecs.lesson_4.level_2.Task_5;

import java.util.Scanner;

class GreatestNumber {
    static String isGreater(int num1, int num2) {
        if (num1 == num2) {
            return "Numbers are equal";
        } else if (num1 > num2) {
            return num1 + " is greater than " + num2;
        } else {
            return num2 + " is greater than " + num1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.println(isGreater(num1, num2));

        scanner.close();
    }
}
