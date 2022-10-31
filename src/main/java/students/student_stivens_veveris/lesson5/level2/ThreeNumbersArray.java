package students.student_stivens_veveris.lesson5.level2;

import java.util.Scanner;

public class ThreeNumbersArray {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three whole numbers");
        int[] numbers = new int [3];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            System.out.println(numbers [i]);
        }
    }
}
