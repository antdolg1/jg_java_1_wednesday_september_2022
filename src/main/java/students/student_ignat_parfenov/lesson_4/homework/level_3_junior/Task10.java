package students.student_ignat_parfenov.lesson_4.homework.level_3_junior;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {

        double a, b, c;

        System.out.println("Please enter three different numbers: ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        if ((a > b && b >= c) || (a > b && b <= c)) {
            System.out.println("The largest number is " + a);
        } else if ((b > a && a >= c) || (b > c && c >= a)) {
            System.out.println("The largest number is " + b);
        } else if ((c > a && a >= b) || (c > b && b >= a)) {
            System.out.println("The largest number is " + c);
        } else {
            System.out.println("Enter please three different!! numbers");
        }
    }
}

