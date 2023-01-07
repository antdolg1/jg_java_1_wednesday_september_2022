package students.student_mihhail_karasjov.Lesson4.Homework.Level2;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = in.nextInt();
        System.out.println("Enter the second number: ");
        int b = in.nextInt();
        if (a < b)
            System.out.println("Smallest number is: " + a);
        else {
            System.out.println("Smallest number is: " + b);
        }
    }
}