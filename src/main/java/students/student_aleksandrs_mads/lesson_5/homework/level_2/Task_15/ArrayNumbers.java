package students.student_aleksandrs_mads.lesson_5.homework.level_2.Task_15;

import java.util.Arrays;

class ArrayNumbers {
    public static void main(String[] args) {
        int[] number = new int[3];
        for (int i = 0; i < number.length; i++) {
            number[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(number));
        for (int i = 0; i < number.length; i++) {
            number[i] += 2;
        }
        System.out.println(Arrays.toString(number));
    }
}

