package students.student_svetlana_seda.lesson_5.homework.level_5and_6;

import java.util.Random;
//1.Напишите в этом классе метод для создания
//массива целых чисел указанной длины.

//2.Создайте в классе ArrayUtil метод для
//заполнения массива случайными целыми числами.

class ArrayUtil {

    int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    static void fillArrayWithRandomNumbers(int[] myArray) {
        Random random = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(100);
        }
    }
//task34
    static void printArrayToConsole(int[] array) {
        System.out.print("Array: [ ");
        for (int element : array) {
            System.out.print(element + " ");
        }

    }
//task 35
    static int findMaxNumber(int [] array) {
        int maxNumber = array[0];
        for (int element : array) {
            if (element > maxNumber) maxNumber =element;
        }
        return maxNumber;
    }
//task 37
    static int findMinNumber(int[] array) {
        int minNumber = array[0];
        for (int element : array) {
            if (element < minNumber) {
                minNumber =element;
            }
        }
        return minNumber;
    }

}

