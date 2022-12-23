package students.student_ignat_parfenov.lesson_9.homework.Level_4_junior;

public class SquareTest {

    public static void main(String[] args) {
        Square square = new Square(15);
        System.out.println("Square side = " + square.getSquareSide());
        System.out.println("Square area = " + square.calculateArea());
        System.out.println("Square perimeter = " + square.calculatePerimeter());
    }
}
