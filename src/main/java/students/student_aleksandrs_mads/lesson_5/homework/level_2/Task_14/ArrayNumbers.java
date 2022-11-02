package students.student_aleksandrs_mads.lesson_5.homework.level_2.Task_14;

import java.util.Arrays;

class ArrayNumbers {
    public static void main(String[] args) {
        int[] number = new int[3];
        int average = 0;
        for (int i = 0; i < number.length; i++) {
            number[i] = (int) (Math.random() * 100);
            average = average + number[i] / number.length;
        }
        System.out.println(Arrays.toString(number));
        System.out.println("Average:" + average);
    }
}

