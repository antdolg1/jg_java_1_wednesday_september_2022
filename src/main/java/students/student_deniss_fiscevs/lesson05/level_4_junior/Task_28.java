package students.student_deniss_fiscevs.lesson05.level_4_junior;

import java.util.Random;

class Task_28 {

    public static void main(String[] args) {

        Random random = new Random();

        int randomArrayLength = random.nextInt(10);
        int[] numbers = new int[randomArrayLength];
        for (int i = 0; i < numbers.length; i++) {
            int randomNumber = random.nextInt(100);
            numbers[i] = randomNumber;
            System.out.println("Element " + "[" + i + "]" + " = " + numbers[i]);
        }

        System.out.println("_____________________________");

        int minValue = numbers[0];

        for (int number : numbers) {

            if (number < minValue) minValue = number;
        }
        System.out.println("The smallest number is " + minValue);
    }
}
