package students.student_ignat_parfenov.lesson_5.homework.level_4_junior;

import java.util.Random;
import java.util.Scanner;

class Task29 {

    public static void main(String[] args) {

        Random random = new Random();
        System.out.print("Please input your array length: ");
        Scanner scanner = new Scanner(System.in);
        int volume = scanner.nextInt();
        int[] evenNumbers = new int[volume];
        for (int i = 0; i < evenNumbers.length; i++) {
            evenNumbers[i] = random.nextInt(50);
            System.out.println(evenNumbers[i]);
        }

        int maxNum = evenNumbers[0];
        for (int j : evenNumbers) {
            if (j > maxNum)
                maxNum = j;
        }

        for (int j : evenNumbers) {
            if (j % 2 == 0) {
                System.out.println(evenNumbers[j]);
            }
        }
        System.out.println("]");
    }
}


