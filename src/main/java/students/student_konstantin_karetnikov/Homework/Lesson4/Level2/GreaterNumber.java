package students.student_konstantin_karetnikov.Homework.Lesson4.Level2;

import java.util.Scanner;

 class GreaterNumber {
    public static void main(String[] args) {
        System.out.print("Please enter first number: ");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        System.out.print("Please enter second number: ");
        scanner = new Scanner(System.in);
        int number2 = scanner.nextInt();
        if (number1 > number2) {
            System.out.println("Greater number - " + (number1));
        }         else if (number1 < number2) {
                System.out.println("Greater number - " + (number2));
        }         else {
            System.out.println("Entered numbers are equal");
        }
    }
}
