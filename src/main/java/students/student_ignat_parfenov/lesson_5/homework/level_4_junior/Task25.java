package students.student_ignat_parfenov.lesson_5.homework.level_4_junior;

import java.util.Arrays;
import java.util.Scanner;

public class Task25 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please specify your array's length: ");
        int userArray = scanner.nextInt();
        int[] userNumbers = new int[userArray];
        for (int i = 0; i < userNumbers.length; i++) {
            System.out.print("Please input array number: " + "[" + userNumbers[i] + "]");
            userNumbers[i] = scanner.nextInt();
        }
        System.out.println("Your entered array is: " + Arrays.toString(userNumbers));
    }
}
