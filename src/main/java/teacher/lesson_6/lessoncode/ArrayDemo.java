package teacher.lesson_6.lessoncode;

import teacher.lesson_5.homework.level_7_senior.task_41.ArrayUtil;

public class ArrayDemo {

    public static void main(String[] args) {

        int arrayLength = ArrayUtils.getArrayLengthFromUser();
        int[] array = ArrayUtils.createArray(arrayLength);
//        ArrayUtils.fillArrayWithNumbersFromUser(array);
        ArrayUtils.fillArrayWithRandomNumbers(array);
        ArrayUtils.printArrayToConsole(array);
        System.out.println("Max value is: " + ArrayUtils.findMaxNumberInArray(array));

    }
}
