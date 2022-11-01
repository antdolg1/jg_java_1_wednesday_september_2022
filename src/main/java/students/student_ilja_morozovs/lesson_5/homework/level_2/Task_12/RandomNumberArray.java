package students.student_ilja_morozovs.lesson_5.homework.level_2.Task_12;

import java.util.Arrays;

class RandomNumberArray {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }
        System.out.println("Random number is: " + Arrays.toString(numbers));
    }
}
