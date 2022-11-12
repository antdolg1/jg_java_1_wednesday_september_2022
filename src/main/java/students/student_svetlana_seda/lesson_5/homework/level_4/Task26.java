package students.student_svetlana_seda.lesson_5.homework.level_4;

import java.util.Scanner;
import java.util.Random;

class Task26 {

    public static void main(String[] args) {

        System.out.println("Enter the array size: ");
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] arrayNumbers = new int[arraySize];

        Random random = new Random();
        int number = 0;

        for (int i = 0; i < arraySize; i++) {
            arrayNumbers[number] = random.nextInt(0, 10);
            number++;
        }
        for (int i = 0; i < arrayNumbers.length; i++) {
            System.out.println(arrayNumbers[i]);
        }

    }

}