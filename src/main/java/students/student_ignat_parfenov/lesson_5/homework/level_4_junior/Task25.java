package students.student_ignat_parfenov.lesson_5.homework.level_4_junior;

import java.util.Arrays;
import java.util.Scanner;

public class Task25 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please specify your array's length: ");
        int userIndex = scanner.nextInt();
        int[] userArray = new int[userIndex];
        for (int i = 0; i < userIndex; i++) {
            System.out.print("Please enter your arrays numbers: " + "[" + userArray[i] + "]");
        }
        System.out.println("Your entered array is: " + Arrays.toString(userArray));
    }
}
