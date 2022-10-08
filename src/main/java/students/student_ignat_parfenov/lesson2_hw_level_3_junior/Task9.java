package students.student_ignat_parfenov.lesson2_hw_level_3_junior;

import java.util.Scanner;

public class Task9 {public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number :");
    int yourNumber = scanner.nextInt();

    int[] array = new int[] { 1-10 };
    for (int i : array) {

        System.out.println(i*yourNumber);
    }
}
}
