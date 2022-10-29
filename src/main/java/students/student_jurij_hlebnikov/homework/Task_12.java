package students.student_jurij_hlebnikov.homework;

import java.util.Arrays;

public class Task_12 {
    public static void main(String[] args) {

        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100) + 1;
        }
        String intAString = Arrays.toString(numbers);
        System.out.println(intAString);
    }
        }


