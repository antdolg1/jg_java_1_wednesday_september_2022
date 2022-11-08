package students.student_artjoms_trosihins.lesson_4.level_1.task1;

import java.util.Scanner;

class IfPositive {

    public static void main(String[] args) {
        System.out.println("Please, enter the number: ");

        Scanner sc = new Scanner(System.in);
        int yourNumber;
        yourNumber = sc.nextInt();

        if (yourNumber > 0) {
            System.out.println("Your number is positive!");
        } else {
            System.out.println("Your number is negative!");
        }
    }
}

