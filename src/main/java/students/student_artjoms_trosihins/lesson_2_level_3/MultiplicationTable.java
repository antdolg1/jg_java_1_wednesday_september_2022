package students.student_artjoms_trosihins.lesson_2_level_3;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int userNumber;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        userNumber = sc.nextInt();

        for (int i = 1; i <= 10; i++)
            System.out.println(userNumber + " * " + i + " = " + userNumber * i);
    }
}
