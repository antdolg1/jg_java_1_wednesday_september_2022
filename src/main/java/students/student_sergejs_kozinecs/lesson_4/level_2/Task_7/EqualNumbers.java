package students.student_sergejs_kozinecs.lesson_4.level_2.Task_7;

import java.util.Scanner;

class EqualNumbers {
    static String areEqual(int num1, int num2) {
        return num1 == num2 ? "Numbers are equal" : "Numbers are different";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.println(areEqual(num1, num2));

        scanner.close();
    }
}
