package students.student_mihhail_karasjov.Lesson4.Homework.Level3;

import java.util.Scanner;

public class LargestOfNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the first number: ");
        int x = in.nextInt();
        System.out.println("Input the second number: ");
        int y = in.nextInt();
        System.out.println("Input the third number: ");
        int z = in.nextInt();
        if (x > y && x > z) {
            System.out.println("Largest number is: " + x);
        } else if (y > x && y > z) {
            System.out.println("Largest number is: " + y);
        } else {
            System.out.println("Largest number is: " + z);
        }
    }
}
