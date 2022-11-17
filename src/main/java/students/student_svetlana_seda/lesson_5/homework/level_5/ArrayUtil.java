package students.student_svetlana_seda.lesson_5.homework.level_5;

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

    static void printArray(int[] myArray) {
        System.out.print("Array: [ ");
        for (int element : myArray) {
            System.out.print(element + " ");
        }
        System.out.println("]" + "\n");
    }

}

