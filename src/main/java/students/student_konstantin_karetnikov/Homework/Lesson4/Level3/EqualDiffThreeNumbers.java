package students.student_konstantin_karetnikov.Homework.Lesson4.Level3;

import java.util.Scanner;

public class EqualDiffThreeNumbers {
    public static void main(String[] args) {
        System.out.print("Please enter first number: ");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        System.out.print("Please enter second number: ");
        scanner = new Scanner(System.in);
        int number2 = scanner.nextInt();
        System.out.print("Please enter third number: ");
        scanner = new Scanner(System.in);
        int number3 = scanner.nextInt();

        if (number1 == number2 && number1 == number3) {
            System.out.println("All numbers are equal");
        }
        else if (number1 != number2 && number1 != number3 && number2 != number3){
            System.out.println("All numbers are different");
        }
         else {
            System.out.println("Neither all are equal or different");
        }
    }
}
