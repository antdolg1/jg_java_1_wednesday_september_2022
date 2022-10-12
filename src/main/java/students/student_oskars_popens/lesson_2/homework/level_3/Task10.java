package students.student_oskars_popens.lesson_2.homework.level_3;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double myRadius;
        double circlePerimeter;
        double circleArea;

        System.out.println("Please enter Radius of circle:");
        myRadius = scanner.nextDouble();

        System.out.println("====================");
        circlePerimeter = Math.PI * (2 * myRadius);
        circleArea = Math.PI * Math.pow(myRadius,2);
        System.out.println("Circle perimeter = " + circlePerimeter);
        System.out.println("Circle area = " + circleArea);
    }
}
