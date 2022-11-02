package students.student_deniss_fiscevs.lesson05.level_4_junior;

import java.util.Random;

class Task_27 {

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

        int maxValue = numbers[0];

//        for (int i = 0; i < numbers.length; i++) { - replaced by line 23
        for (int number : numbers) {

            if (number > maxValue) maxValue = number;
        }
        System.out.println("The largest number is " + maxValue);
    }
}