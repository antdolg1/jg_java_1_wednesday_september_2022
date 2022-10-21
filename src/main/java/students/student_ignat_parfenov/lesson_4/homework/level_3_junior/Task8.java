package students.student_ignat_parfenov.lesson_4.homework.level_3_junior;

import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {

        double a, b, c;

        System.out.println("Please enter three numbers: ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        if (a == b && b == c) {
            System.out.println("All numbers are equal");
        } else if (a != b && b != c) {
            System.out.println("All numbers are different");
        } else if ((a == b && a != c) || (b == c && b != a) || (a == c && a != b)){
            System.out.println("Neither all are equal or different");
        }
    }
}
