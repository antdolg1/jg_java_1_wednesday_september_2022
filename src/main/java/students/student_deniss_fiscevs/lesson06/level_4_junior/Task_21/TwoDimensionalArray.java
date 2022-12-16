package students.student_deniss_fiscevs.lesson06.level_4_junior.Task_21;

import java.util.Arrays;
import java.util.Random;


class TwoDimensionalArray {


    public static void main(String[] args) {

        Random random = new Random();

        int[][] array = new int[4][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int number = random.nextInt(0, 10);
                array[i][j] = number;
            }
        }

        for (int[] ints : array) {
            System.out.println(Arrays.toString(ints));
        }

        System.out.println("Sum of all array number is " + sumOfAllArrayNumbers(array));
    }

    static int sumOfAllArrayNumbers(int[][] array) {
        int sumCounter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sumCounter = sumCounter + array[i][j];
            }
        }
        return sumCounter;
    }

}