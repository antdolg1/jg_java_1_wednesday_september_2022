package students.student_jurij_hlebnikov.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        int[] userNumbers = new int[3];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter 3 numbers:");

        int userNumber1 = scanner.nextInt();
        int userNumber2 = scanner.nextInt();
        int userNumber3 = scanner.nextInt();
        userNumbers[0] = userNumber1;
        userNumbers[1] = userNumber2;
        userNumbers[2] = userNumber3;

        System.out.println(Arrays.toString(userNumbers));
    }
}
