package students.student_ignat_parfenov.lesson_5.homework.level_4_junior;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayNumbers {

    public static void main(String[] args) {

        System.out.println("Please input your array's length: ");
        Scanner scanner = new Scanner(System.in);
        int userArrayLength = scanner.nextInt();
        int[] userRandomArray = new int[userArrayLength];
        ArrayNumbers arrayNumbers = new ArrayNumbers();
        arrayNumbers.randomNumber(userRandomArray);
        System.out.println("Your random array is: " + Arrays.toString(userRandomArray));
        }

        void randomNumber(int[] userRandomArray) {
        for (int i = 0; i < userRandomArray.length; i++){
            userRandomArray[i] = (int) (Math.random() * userRandomArray.length);
        }
    }
}
