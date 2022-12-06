package students.student_ilja_morozovs.lesson_5.homework.level_2.Task_14;

import java.util.Scanner;

class RandomArrayMidNum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input array volume: ");
        int arrayIndex = scanner.nextInt();
        int[] numbers = new int[arrayIndex];
        RandomArrayMidNum randomArrayMidNum = new RandomArrayMidNum();
        System.out.println("Array average number is: " + (randomArrayMidNum.randomArrayMid(numbers)));
    }

    double randomArrayMid(int[] numbers) {
        double randomNum = 0.0;
        for (int randomNumbers : numbers) {
            randomNumbers = (int) (Math.random() * 100);
            randomNum += randomNumbers;
            System.out.println("[" + randomNumbers + "]");
        }
        return randomNum / numbers.length;
    }
}
