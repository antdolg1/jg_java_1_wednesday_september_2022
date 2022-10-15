package students.student_sergejs_kozinecs.lesson_2.level_3;

import java.util.Scanner;
import java.lang.Math;

public class Circle {

    public static double calculatePerimeter(double radius) {
        return 2 * radius * Math.PI;
    }

    public static double calculateArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static void main(String[] args) {
        double radius, perimeter, area;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter circle radius:");
        radius = scanner.nextDouble();
        perimeter = calculatePerimeter(radius);
        area = calculateArea(radius);

        System.out.println("Perimeter is = " + perimeter +
                "\nArea is = " + area);

        scanner.close();
    }

}
