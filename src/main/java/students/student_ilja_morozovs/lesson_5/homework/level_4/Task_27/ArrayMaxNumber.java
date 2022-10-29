package students.student_ilja_morozovs.lesson_5.homework.level_4.Task_27;

import java.util.Arrays;
import java.util.Scanner;

class ArrayMaxNumber {
    public static void main(String[] args) {
        System.out.println("Please input array volume: ");
        Scanner scanner = new Scanner(System.in);
        ArrayMaxNumber arrayMaxNumber = new ArrayMaxNumber();
        int arrayIndex = scanner.nextInt();
        int[] userNumbers = new int[arrayIndex];
        arrayMaxNumber.arrayRandomNumbers(userNumbers);
        System.out.println(Arrays.toString(userNumbers));
        System.out.println("Max number is: " + arrayMaxNumber.arrayMaxNumber(userNumbers));
    }

    void arrayRandomNumbers(int[] userNumbers) {
        for (int i = 0; i < userNumbers.length; i++) {
            userNumbers[i] = (int) (Math.random() * userNumbers.length);
        }
    }

    int arrayMaxNumber(int[] userNumbers) {
        int maxNumber = userNumbers[0];
        for (int i = 0; i < userNumbers.length; i++) {
            if (userNumbers[i] > maxNumber) {
                maxNumber = userNumbers[i];
            }
        }
        return maxNumber;
    }
}
