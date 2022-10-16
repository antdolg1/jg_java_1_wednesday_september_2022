package students.student_ilja_morozovs.lesson_3.homework.level_7.Task_30;

import java.util.Scanner;

class CircleDemo {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please add radius: ");
        circle.setRadius(scanner.nextDouble());
        circle.circleArea = circle.calculateArea();
        System.out.println("Circle area is: " + circle.getCircleArea());
    }
}
