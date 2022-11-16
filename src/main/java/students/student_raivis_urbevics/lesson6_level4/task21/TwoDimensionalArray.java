package students.student_raivis_urbevics.lesson6_level4.task21;

import java.util.Arrays;
import java.util.Random;

class TwoDimensionalArray {

    int[][] arrayCreate(int arraySize) {
        return new int[arraySize][arraySize];
    }

    void printArrayToConsole(int[][] arrayToPrint) {
        System.out.println("Two dimensional array = ");
        for (int twoArray[]  : arrayToPrint ) {
            System.out.println(Arrays.toString(twoArray));

            }
        }

    void arrayWithRandomNumber(int[][] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] = random.nextInt(10);
            }

    int sumOfTwoRandomDimensionalArray(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }
}
