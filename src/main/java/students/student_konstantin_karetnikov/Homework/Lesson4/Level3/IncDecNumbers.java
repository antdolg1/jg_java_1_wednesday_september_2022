package students.student_konstantin_karetnikov.Homework.Lesson4.Level3;

import java.util.Scanner;

public class IncDecNumbers {
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

        if (number1 < number2 && number2 < number3) {
            System.out.println("Increasing");
        }
        else if (number1 > number2 && number2 > number3){
            System.out.println("Decreasing");
        }
         else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
