package teacher.lesson_6.lessoncode;

import java.util.Random;
import java.util.Scanner;

class ArrayUtils {

    static int getArrayLengthFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int arrayLength = scanner.nextInt();
        return arrayLength;
    }

    static int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    static void fillArrayWithNumbersFromUser(int[] arrayToFill) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arrayToFill.length; i++) {
            System.out.println("Enter value for array element with index " + i);
            arrayToFill[i] = scanner.nextInt();
        }
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

    static int findMaxNumberInArray(int[] array) {
        int maxNumber = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
            }
        }
        return maxNumber;
    }

}
