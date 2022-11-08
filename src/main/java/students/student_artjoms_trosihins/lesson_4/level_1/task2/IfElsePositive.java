package students.student_artjoms_trosihins.lesson_4.level_1.task2;

import java.util.Scanner;

class IfElsePositive {

    public static void main(String[] args) {

        System.out.println("Hello! Please, enter the number :");

        Scanner scan = new Scanner(System.in);
        int yourNewNumber;
        yourNewNumber = scan.nextInt();

        if (yourNewNumber > 0) {
            System.out.println("Number is positive!");
        } else if (yourNewNumber < 0) {
            System.out.println("Number is negative!");
        } else if (yourNewNumber == 0) {
            System.out.println("Number is zero!");
        }
    }
}
