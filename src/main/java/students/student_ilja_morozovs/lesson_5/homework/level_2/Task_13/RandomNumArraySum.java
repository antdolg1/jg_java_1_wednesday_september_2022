package students.student_ilja_morozovs.lesson_5.homework.level_2.Task_13;

import java.util.Scanner;

class RandomNumArraySum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input array volume: ");
        int arrayIndex = scanner.nextInt();
        int[] numbers = new int[arrayIndex];
        RandomNumArraySum randomNumArraySum = new RandomNumArraySum();
        System.out.println("Sum of random numbers is: " + randomNumArraySum.arrayRandomNumbers(numbers));
    }

    int arrayRandomNumbers(int[] numbers) {
        int randomNumberSum = 0;
        for (int randomNumbers : numbers) {
            randomNumbers = (int) (Math.random() * 100);
            System.out.println("[" + randomNumbers + "]");
            randomNumberSum += randomNumbers;
        }
        return randomNumberSum;
    }
}


