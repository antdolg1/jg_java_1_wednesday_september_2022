package students.student_zanna_klimova.lesson_9.level_4;

public class Triangle extends Shape{
    private double length;
    private double height;
    private double side1;
    private double side2;
    private double side3;

    public Triangle(String title, double length, double height) {
        super(title);
        this.length = length;
        this.height = height;
    }

    public Triangle(String title, double side1, double side2, double side3) {
        super(title);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    double calculateArea() {
        return 0.5 * (length * height);
    }

    @Override
    double calculatePerimeter() {
        return side1 * side2 * side3;
    }
}
