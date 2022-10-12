package students.student_ilja_morozovs.lessons_2.homework.level_3.Task_10;

import java.util.Scanner;

public class CircleArea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double circleRadius;
        System.out.println("Enter circle radius: ");
        circleRadius = scanner.nextDouble();
        System.out.println("Expected Output: ");
        double areaResult = Math.PI * (circleRadius * circleRadius);
        System.out.println("Area is = " + areaResult);
        double perimetrResult = 2 * Math.PI * circleRadius;
        System.out.println("Perimeter is = " + perimetrResult);
    }
}
