package students.student_svetlana_seda.lesson2.level3;

import java.util.Scanner;

public class CircleRadius {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the circle radius: ");
                double radiusNumber = scanner.nextDouble();
                    double areaNumber = radiusNumber * radiusNumber;
                    double pi = 3.14;
                    double perimeterNumber = 2 * radiusNumber;
                        System.out.println("Perimeter is =" + pi * perimeterNumber);
                        System.out.println("Area is =" + pi * areaNumber);

    }

}
