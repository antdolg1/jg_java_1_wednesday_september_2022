package students.student_sergejs_kozinecs.lesson_4.level_2.Task_6;

import java.util.Scanner;

class SmallestNumber {
    static String IsLowest(int num1, int num2) {
        if (num1 == num2) {
            return "Numbers are equal";
        } else if (num1 < num2) {
            return "Lowest number is: " + num1;
        } else {
            return "Lowest number is: " + num2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.println(IsLowest(num1, num2));

        scanner.close();
    }
}
