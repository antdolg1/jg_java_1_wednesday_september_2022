package students.student_svetlana_seda.lesson_6.homework.level_4.task_21;

import java.util.Random;
import java.util.Arrays;

//- создайте двумерный массив;
//- заполните двумерный массив случайными числами;
//- посчитайте сумму всех чисел в двумерном массиве.
class TwoDimensionalArray {

    int[][] createArray(int arraySize) {
        return new int[arraySize][arraySize];
    }

    void fillArrayWithRandomNumbers(int[][] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array[i].length; j++)
                array[i][j] = random.nextInt(5);
    }

    void printArrayToConsole(int[][] arrayToPrint) {
        System.out.println("Two dimensional array numbers are ");
        for (int TwoDimArray[] : arrayToPrint) {
            System.out.println(Arrays.toString(TwoDimArray));
        }
    }

    int sumOfTwoDimensionalArray(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }

}



