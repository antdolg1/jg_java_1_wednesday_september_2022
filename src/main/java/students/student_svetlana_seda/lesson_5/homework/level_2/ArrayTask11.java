package students.student_svetlana_seda.lesson_5.homework.level_2;

import java.util.Scanner;

class ArrayTask11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        System.out.println("Enter the second number: ");
        System.out.println("Enter the third number: ");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();

        int[] numbers = new int[3];
        numbers[0] = firstNumber;
        numbers[1] = secondNumber;
        numbers[2] = thirdNumber;

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

    }

}
