package students.student_raivis_urbevics.lesson5_level4.task27;

import java.util.Random;

class GreatestNumberOfArray {
    public static void main(String[] args) {

        int[] numbers = new int[5];

        Random random = new Random();

        numbers[0] = random.nextInt(100);
        numbers[1] = random.nextInt(100);
        numbers[2] = random.nextInt(100);
        numbers[3] = random.nextInt(100);
        numbers[4] = random.nextInt(100);

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);

        int maxNumber = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }
        System.out.println("Max number  = " + maxNumber);
    }
}
