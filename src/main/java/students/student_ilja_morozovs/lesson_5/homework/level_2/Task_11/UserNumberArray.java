package students.student_ilja_morozovs.lesson_5.homework.level_2.Task_11;

import java.util.Arrays;
import java.util.Scanner;

class UserNumberArray {

    public static void main(String[] args) {
        int[] numbersArray = new int[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the numbers: ");
        for (int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = scanner.nextInt();
        }
        System.out.println("You enter this numbers: " + Arrays.toString(numbersArray));
    }
}
