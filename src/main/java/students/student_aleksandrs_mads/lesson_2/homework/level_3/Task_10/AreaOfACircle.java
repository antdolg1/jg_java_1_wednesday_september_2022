package students.student_aleksandrs_mads.lesson_2.homework.level_3.Task_10;

import java.awt.geom.Area;
import java.util.Scanner;

public class AreaOfACircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radiusCircle = scanner.nextDouble();
        System.out.println(radiusCircle);
        System.out.println("Perimeter is = " + 2 * radiusCircle * Math.PI);
        System.out.println("Area is = " + (radiusCircle * radiusCircle) * Math.PI);
    }
}
