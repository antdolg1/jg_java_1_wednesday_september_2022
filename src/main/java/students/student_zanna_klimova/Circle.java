package students.student_zanna_klimova;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter radius of circle: ");
        double radius = scanner.nextDouble();
        double perimeter = 2 * radius * Math.PI;
        double area = Math.PI * radius * radius;
        System.out.println("Perimeter of the circle is " + perimeter);
        System.out.println("Area of circle is " + area);
    }
}
