package students.student_mihhail_karasjov.Lesson4.Homework.Level1;

import java.util.Scanner;

public class PositiveOrNegativeOrEqualsZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter number: ");
        int input = in.nextInt();

        if (input > 0) {
            System.out.println("Number is positive");
        } else if (input < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number equals zero");
        }
    }
}
