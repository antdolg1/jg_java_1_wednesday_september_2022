package students.student_zanna_klimova.lesson_5.level_2;

import java.util.Arrays;

public class RandomArrayPlusTwo {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = ((int) (Math.random() * 100));
        }
            System.out.println(Arrays.toString(numbers));
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = numbers[i] + 2;
            }
        System.out.println(Arrays.toString(numbers));
        }
    }
