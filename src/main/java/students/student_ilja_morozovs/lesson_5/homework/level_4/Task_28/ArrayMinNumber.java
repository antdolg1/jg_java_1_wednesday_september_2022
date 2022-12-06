package students.student_ilja_morozovs.lesson_5.homework.level_4.Task_28;

import java.util.Arrays;
import java.util.Scanner;

class ArrayMinNumber {
    public static void main(String[] args) {
        System.out.println("Please input array volume: ");
        Scanner scanner = new Scanner(System.in);
        int arrayIndex = scanner.nextInt();
        int[] userNumbers = new int[arrayIndex];
        ArrayMinNumber arrayMinNumber = new ArrayMinNumber();
        arrayMinNumber.arrayRandomNumbers(userNumbers);
        System.out.println("Array is:" + Arrays.toString(userNumbers));
        System.out.println("Min number in array is " + arrayMinNumber.minArrayNumber(userNumbers));
    }

    void arrayRandomNumbers(int[] userNumbers) {
        for (int i = 0; i < userNumbers.length; i++) {
            userNumbers[i] = (int) (Math.random() * 100);
        }
    }

    int minArrayNumber(int[] userNumbers) {
        int minNumber = userNumbers[0];
        for (int userNumber : userNumbers) {
            if (userNumber < minNumber) {
                minNumber = userNumber;
            }
        }
        return minNumber;
    }
}
