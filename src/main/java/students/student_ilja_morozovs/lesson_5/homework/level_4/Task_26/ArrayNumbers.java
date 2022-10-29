package students.student_ilja_morozovs.lesson_5.homework.level_4.Task_26;

import java.util.Arrays;
import java.util.Scanner;

class ArrayNumbers {

    public static void main(String[] args) {
        System.out.println("Please input array volume: ");
        Scanner scanner = new Scanner(System.in);
        int arrayIndex = scanner.nextInt();
        int[] userNumbers = new int[arrayIndex];
        ArrayNumbers arrayNumbers = new ArrayNumbers();
        arrayNumbers.randomNumber(userNumbers);
        System.out.println("Array is: "+Arrays.toString(userNumbers));
    }

    void randomNumber(int[] userNumbers) {
        for (int i = 0; i < userNumbers.length; i++) {
            userNumbers[i] = (int) (Math.random() * userNumbers.length);
        }
    }
}
