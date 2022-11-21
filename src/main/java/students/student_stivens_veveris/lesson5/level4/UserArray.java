package students.student_stivens_veveris.lesson5.level4;

import java.util.Scanner;

class UserArray {

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
            System.out.println("Enter value for array length element with index " + i);
            arrayToFill[i] = scanner.nextInt();
        }
    }

    static void printArrayToConsole(int[] arrayToPrint) {
        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.println("Array element value: " + arrayToPrint[i]);
        }
    }
}
