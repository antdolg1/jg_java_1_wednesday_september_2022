package students.student_oskars_popens.lesson_5.level_5_middle;

//Создайте класс ArrayUtil.
//Напишите в этом классе метод для создания
//массива целых чисел указанной длины.

import java.util.Random;

class ArrayUtil {
    public static int[] createArray(int arrayLength) {
        int[] array = new int[arrayLength];
        return array;
    }

    public static void fillArrayWithRandomNumbers(int[] array){
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i]= rnd.nextInt(1000);
        }
    }
}
