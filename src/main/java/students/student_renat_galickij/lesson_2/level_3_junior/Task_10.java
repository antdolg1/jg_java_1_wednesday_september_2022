package students.student_renat_galickij.lesson_2.level_3_junior;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        double per, area;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter circle's radius");
        double radius = scanner.nextDouble();
        per = 2 * radius * 3.14;
        area = 3.14 * radius * radius;
        System.out.println("Perimeter is " + per);
        System.out.println("Area is " + area);
    }
}
