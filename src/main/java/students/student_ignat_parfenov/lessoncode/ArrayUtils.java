package students.student_ignat_parfenov.lessoncode;

import java.util.Scanner;

public class ArrayUtils {

    static int getArrayLengthFromUSer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your array length: ");
        int arrayLength = scanner.nextInt();
        return arrayLength;
    }

    static int[] createArray(int arrayLenth) {
        return new int[arrayLenth];
    }

    static void fillArrayWithNumbersFromUSer(int[] arrayToFill) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arrayToFill.length; i++) {
            System.out.println("Enter value for array element with index " + i);
            arrayToFill[i] = scanner.nextInt();
        }
    }
}
