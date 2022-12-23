package students.student_ignat_parfenov.lesson_9.homework.Level_4_junior;

public class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }
}
