package students.student_ilja_morozovs.lesson_6.homework.level_4.Task_21;

import java.util.Arrays;
import java.util.Random;

class TwoDimensionArrayUtil {

    void showTwoDimArr(int[][] arr) {
        System.out.println("Two dimensional array is:");
        for (int[] twoDimArr : arr) {
            System.out.println(Arrays.toString(twoDimArr));
        }
    }

    int[][] arrayCreating(int arraySize) {
        return new int[arraySize][arraySize];
    }

    int arraySum(int[][] arr) {
        int sum = 0;
        for (int[] row : arr) {
            for (int columns : row) {
                sum += columns;
            }
        }
        return sum;
    }

    void fillArray(int[][] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(100);
            }
        }
    }
//    int arraySum(int[][] arr) {
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                sum += arr[i][j];
//            }
//        }
//        return sum;
//    }
}
