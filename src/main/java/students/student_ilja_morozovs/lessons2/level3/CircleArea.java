package students.student_ilja_morozovs.lessons2.level3;

import java.util.Scanner;

public class CircleArea {
    double circleRadius;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CircleArea circleArea = new CircleArea();
        System.out.println("Enter circle radius: ");
        circleArea.circleRadius = scanner.nextDouble();
        System.out.println("Expected Output: ");
        double areaResult = Math.PI * (circleArea.circleRadius * circleArea.circleRadius);
        System.out.println("Area is = " + areaResult);
        double perimetrResult = 2 * Math.PI * circleArea.circleRadius;
        System.out.println("Perimeter is = " + perimetrResult);
    }
}
