package students.student_deniss_fiscevs.lesson05.level_4_junior;

import java.util.Random;

class Task_27 {

    public static void main(String[] args) {

        Random random = new Random();

        int randomArrayLength = random.nextInt(10);
        int[] numbers = new int[randomArrayLength];
        int maxValue = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);

            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
            }

            System.out.println("Element " + "[" + i + "]" + " = " + numbers[i]);
        }

        System.out.println("_____________________________");
        System.out.println("The largest number is " + maxValue);
    }
}