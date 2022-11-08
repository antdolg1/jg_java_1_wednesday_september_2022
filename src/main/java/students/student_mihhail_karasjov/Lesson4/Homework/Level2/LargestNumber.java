package students.student_mihhail_karasjov.Lesson4.Homework.Level2;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = in.nextInt();
        System.out.println("Enter the second number: ");
        int b = in.nextInt();
        System.out.println("Enter the third number: ");
        int c = in.nextInt();
        if (a > b)
            if (a > c)
                System.out.println("Largest number is: " + a);
            else {
                if (c < b)
                    System.out.println("Largest number is: " + b);
            }
        else {
            System.out.println("Largest number is: " + c);
        }
    }
}
