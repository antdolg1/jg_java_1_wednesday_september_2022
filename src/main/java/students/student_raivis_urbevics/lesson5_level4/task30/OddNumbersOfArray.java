package students.student_raivis_urbevics.lesson5_level4.task30;

import java.util.Random;

class OddNumbersOfArray {
    public static void main(String[] args) {

        int[] numbers = new int[8];

        Random random = new Random();

        numbers[0] = random.nextInt(100);
        numbers[1] = random.nextInt(100);
        numbers[2] = random.nextInt(100);
        numbers[3] = random.nextInt(100);
        numbers[4] = random.nextInt(100);
        numbers[5] = random.nextInt(100);
        numbers[6] = random.nextInt(100);
        numbers[7] = random.nextInt(100);

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);
        System.out.println(numbers[5]);
        System.out.println(numbers[6]);
        System.out.println(numbers[7]);

        System.out.println();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                System.out.println(numbers[i]);
            }
        }
    }
}
