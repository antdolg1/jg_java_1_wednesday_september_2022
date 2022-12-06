package students.student_ilja_morozovs.lesson_5.homework.level_4.Task_25;

import java.util.Arrays;
import java.util.Scanner;

class UserArrayNumbers {

    public static void main(String[] args) {

        System.out.println("Please enter the array volume: ");
        Scanner scanner = new Scanner(System.in);
        int arrayIndex = scanner.nextInt();
        int[] userNumbers = new int[arrayIndex];
        for (int i = 0; i < userNumbers.length; i++) {
            System.out.println("Please input array number in the cell: " + "[" + i + "]");
            userNumbers[i] = scanner.nextInt();
        }
        System.out.println("You input this array numbers: " + Arrays.toString(userNumbers));
    }
}
