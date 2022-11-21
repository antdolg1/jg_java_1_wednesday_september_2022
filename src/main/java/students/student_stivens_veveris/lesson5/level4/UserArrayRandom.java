package students.student_stivens_veveris.lesson5.level4;

import java.util.Random;
import java.util.Scanner;

class UserArrayRandom {

    static int getArrayLengthFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int arrayLength = scanner.nextInt();
        return arrayLength;
    }

    static int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    static void fillArrayWithRandomNumbers(int[] arrayToFill) {
        Random random = new Random();
        for (int i = 0; i < arrayToFill.length; i++) {
            arrayToFill[i] = random.nextInt(1000);
        }
    }

    static void printArrayToConsole(int[] arrayToPrint) {
        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.println("Array element value: " + arrayToPrint[i]);
        }
    }
}
