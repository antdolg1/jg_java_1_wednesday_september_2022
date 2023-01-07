package students.student_oskars_popens.lesson_9.level_4_5;

class Circle extends Shape {

    private double radius;

    Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    // реализуйте метод calculateArea()
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;

    }

    // реализуйте метод calculatePerimeter()
    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }
}