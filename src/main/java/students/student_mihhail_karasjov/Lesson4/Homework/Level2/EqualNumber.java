package students.student_mihhail_karasjov.Lesson4.Homework.Level2;

import java.util.Scanner;

public class EqualNumber {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = in.nextInt();
        System.out.println("Enter the second number: ");
        int b = in.nextInt();
        if (a == b)
            System.out.println("Numbers are equals");
        else {
            System.out.println("Numbers are different");
        }
    }
}
