package students.student_raivis_urbevics.lesson5_level4.task26;

import java.util.Scanner;

class LengthArray1 {
    public static void main(String[] args) {
        System.out.println("Please enter the length of array");
        Scanner scanner = new Scanner(System.in);
        int lengthOfArray = scanner.nextInt();
        int[] numbers = new int[lengthOfArray];
        numbers[0] = 34;
        numbers[1] = 56;
        numbers[2] = 574;
        numbers[3] = 0;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);

    }
}
