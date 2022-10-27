package students.student_zanna_klimova.lesson_4.level_2;

import java.util.Scanner;

 class BiggestNumber {
     static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert two whole numbers: ");
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();

        if (numberOne > numberTwo) {
            System.out.println("_________________________________");
            System.out.println(numberOne);
        } else {
            System.out.println("_________________________________");
            System.out.println(numberTwo);
        }
    }
}
