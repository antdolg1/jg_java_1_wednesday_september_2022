package students.student_vladislav_saksin.lesson_5.homework.level_2;

import java.util.Arrays;

class Task12 {

    public static void main(String[] args) {

        int[] numbers = new int[3];

        numbers[0] = (int) (Math.random() * 1000);
        numbers[1] = (int) (Math.random() * 1000);
        numbers[2] = (int) (Math.random() * 1000);
        System.out.println(Arrays.toString(numbers));
    }

}
