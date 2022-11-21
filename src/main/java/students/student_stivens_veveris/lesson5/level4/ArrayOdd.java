package students.student_stivens_veveris.lesson5.level4;

import java.util.Random;

public class ArrayOdd {

    public static void main(String[] args) {

        int[] numbers = new int[4];

        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1000);
            {
                System.out.println("Array elements are: " + numbers[i]);
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 > 0) {
                System.out.println("Array's odd element numbers are: " + numbers[i]);
            }
        }
    }
}
