package students.student_ignat_parfenov.lesson_4.homework.level_3_junior;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {

        double a, b, c;

        System.out.println("Please enter three different numbers: ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        if (a > b && b >= c) {
            System.out.println("Number are increasing");
        } else if (c > b && b >= a) {
            System.out.println("Numbers are decreasing");
        } else {
            System.out.println("Enter please three different!! numbers");
        }
    }
}
