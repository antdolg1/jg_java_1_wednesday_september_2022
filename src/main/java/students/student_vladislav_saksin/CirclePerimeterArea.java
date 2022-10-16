package students.student_vladislav_saksin;

import java.util.Scanner;

public class CirclePerimeterArea {

    public static void main(String[] args) {

        double circleRadius;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Test Data:");
        System.out.println("Radius = ");
        circleRadius = scanner.nextDouble();

        System.out.println("Expected Output :");
        System.out.println("Perimeter is: " + 2 * 3.141592653589793 * circleRadius);
        System.out.println("Area is: " + 3.141592653589793 * (circleRadius * circleRadius));

    }


}
