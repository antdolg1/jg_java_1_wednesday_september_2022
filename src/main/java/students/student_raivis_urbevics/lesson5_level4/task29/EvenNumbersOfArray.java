package students.student_raivis_urbevics.lesson5_level4.task29;

import java.util.Arrays;

class EvenNumbersOfArray {
    public static void main(String[] args) {
        int[] numbers = new int[6];
        numbers[0] = 10;
        numbers[1] = 11;
        numbers[2] = 12;
        numbers[3] = 13;
        numbers[4] = 14;
        numbers[5] = 15;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);
        System.out.println(numbers[5]);

        System.out.println(          );


        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }
    }
}
