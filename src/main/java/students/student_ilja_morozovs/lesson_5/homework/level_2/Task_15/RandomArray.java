package students.student_ilja_morozovs.lesson_5.homework.level_2.Task_15;

import java.util.Arrays;
class RandomArray {

    public static void main(String[] args) {
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * numbers.length);
        }
        System.out.println("Array numbers is: " + Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] + 2;
        }
        System.out.println("Array numbers +2 is: " + Arrays.toString(numbers));

    }
}
