package students.student_oskars_popens.lesson_9.level_4_5;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square(15);
        System.out.println("Square side length: " + square.getSquareSize());
        System.out.println("Square area is: " + square.calculateArea());
        System.out.println("Square perimeter is: " + square.calculatePerimeter());
    }
}
