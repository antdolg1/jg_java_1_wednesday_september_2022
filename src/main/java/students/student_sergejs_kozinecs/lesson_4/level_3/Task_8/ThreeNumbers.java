package students.student_sergejs_kozinecs.lesson_4.level_3.Task_8;

import java.util.Scanner;

class ThreeNumbers {
    static String areEqualOrNot(int num1, int num2, int num3) {
        if (num1 == num2 && num2 == num3) {
            return "All numbers are equal";
        } else if (num1 != num2 && num2 != num3) {
            return "All numbers are different";
        } else {
            return "Neither all are equal or different";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        System.out.println(areEqualOrNot(num1, num2, num3));

        scanner.close();
    }
}
