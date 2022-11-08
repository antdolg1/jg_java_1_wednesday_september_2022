package students.student_artjoms_trosihins.lesson_4.level_1.task4;

import java.util.Scanner;

class IfEvenOrOdd {
    public static void main(String[] args) {

        System.out.println("Hello! Please enter a number!");

        int yourNumber;
        Scanner scan = new Scanner(System.in);
        yourNumber = scan.nextInt();

        if (yourNumber % 2 == 0) {
            System.out.println("Your number is even!");
        } else
            System.out.println("Your number is odd!");

    }
}
