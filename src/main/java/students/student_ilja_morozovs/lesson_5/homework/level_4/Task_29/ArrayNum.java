package students.student_ilja_morozovs.lesson_5.homework.level_4.Task_29;

import java.util.Arrays;
import java.util.Scanner;

class ArrayNum {
    public static void main(String[] args) {
        System.out.println("Please input the array volume: ");
        Scanner scanner = new Scanner(System.in);
        int arrayIndex = scanner.nextInt();
        int[] userNumbers = new int[arrayIndex];
        ArrayNum arrayNum = new ArrayNum();
        arrayNum.arrayRandomNumbers(userNumbers);
        System.out.println("Array is: " + Arrays.toString(userNumbers));
        arrayNum.isEvenNumber(userNumbers);
    }

    void arrayRandomNumbers(int[] userNumbers) {
        for (int i = 0; i < userNumbers.length; i++) {
            userNumbers[i] = (int) (Math.random() * 100);
        }
    }

    void isEvenNumber(int[] userNumbers) {
        int evenNumber;
        System.out.print("Even number is: ");
        System.out.print("[");
        for (int userNumber : userNumbers) {
            if (userNumber % 2 == 0) {
                evenNumber = userNumber;
                System.out.print(" " + evenNumber + " ");
            }
        }
        System.out.println("]");
    }
}
