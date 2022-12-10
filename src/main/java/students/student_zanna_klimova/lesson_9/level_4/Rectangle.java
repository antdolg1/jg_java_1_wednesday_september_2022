package students.student_zanna_klimova.lesson_9.level_4;

public class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(String title, double length, double width) {
        super(title);
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (length + width);
    }
}
