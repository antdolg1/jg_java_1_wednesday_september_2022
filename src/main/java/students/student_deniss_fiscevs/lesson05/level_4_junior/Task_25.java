package students.student_deniss_fiscevs.lesson05.level_4_junior;

import java.util.Scanner;

class Task_25 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter the array's length: ");
        int userArrayLength = scanner.nextInt();

        int[] numbers = new int[userArrayLength];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter the " + "[" + i + "]" + " number: ");
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element " + "[" + i + "]" + " = " + numbers[i]);
        }
    }

}

