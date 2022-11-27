package students.student_igor_budnitski.level3;

/*
Напишите программу, которая запрашивает у пользователя
радиус круга (вещественное число) и печатает на консоль
периметр и площадь круга.
* */

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        double radius;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter circle radius: ");
        radius = scanner.nextDouble();
        System.out.println("Circle area with " + radius + " will equal to " + (Math.PI * radius * radius));
    }
}
