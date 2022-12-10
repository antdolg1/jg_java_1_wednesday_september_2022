package students.student_zanna_klimova.lesson_9.level_4;

public class ShapeDemo {
    public static void main(String[] args) {
        Circle circle = new Circle("Circle", 5);
        Square square = new Square("Square", 7);
        Rectangle rectangle = new Rectangle("Rectangle", 2, 6);
        Triangle triangleArea = new Triangle("Triangle", 10, 2);
        Triangle trianglePerimeter = new Triangle("Triangle", 2, 5, 6);
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatePerimeter());
        System.out.println(square.calculateArea());
        System.out.println(square.calculatePerimeter());
        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());
        System.out.println(triangleArea.calculateArea());
        System.out.println(trianglePerimeter.calculatePerimeter());
    }
}
