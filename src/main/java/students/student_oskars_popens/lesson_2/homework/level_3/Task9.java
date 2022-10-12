package students.student_oskars_popens.lesson_2.homework.level_3;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myNumber;

        System.out.println("Please enter number:");
        myNumber = scanner.nextInt();
        System.out.println("====================");

        for (int i = 0; i <= 10 ; i++) {
            System.out.printf( "%d * %d = %d\n", myNumber, i, myNumber * i);
        }
    }
}
