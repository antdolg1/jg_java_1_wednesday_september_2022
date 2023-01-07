package students.student_mihhail_karasjov.Lesson4.Homework.Level3;

import java.util.Scanner;

public class IncreaseOrDecrease {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double x = in.nextDouble();
        System.out.print("Enter the second number: ");
        double y = in.nextDouble();
        System.out.print("Enter the third number: ");
        double z = in.nextDouble();
        if (x < y && y < z) {
            System.out.println("Increasing order");
        } else if (x > y && y > z) {
            System.out.println("Decreasing order");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
