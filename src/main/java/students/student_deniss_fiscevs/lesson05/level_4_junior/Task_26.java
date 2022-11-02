package students.student_deniss_fiscevs.lesson05.level_4_junior;

import java.util.Random;
import java.util.Scanner;

class Task_26 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Please, enter the array's length: ");
        int userArrayLength = scanner.nextInt();
        int[] numbers = new int[userArrayLength];
        for (int i = 0; i < numbers.length; i++) {
            int randomNumber = random.nextInt(100);
            numbers[i] = randomNumber;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element " + "[" + i + "]" + " = " + numbers[i]);
        }
    }
}
