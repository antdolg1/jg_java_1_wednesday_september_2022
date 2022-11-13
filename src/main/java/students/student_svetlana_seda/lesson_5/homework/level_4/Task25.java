package students.student_svetlana_seda.lesson_5.homework.level_4;

import java.util.Arrays;
import java.util.Scanner;

class Task25 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array Volume: ");
        int arrayVolume = scanner.nextInt();
        int[] arrayNumbers = new int[arrayVolume];

        for (int i = 0; i < arrayNumbers.length; i++) {
            System.out.println("Enter the array number: ");
            arrayNumbers[i] = scanner.nextInt();
        }
        System.out.println("The array numbers: " + Arrays.toString(arrayNumbers));

    }

}
