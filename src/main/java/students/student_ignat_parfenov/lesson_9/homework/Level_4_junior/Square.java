package students.student_ignat_parfenov.lesson_9.homework.Level_4_junior;

public class Square extends Shape {

    private double squareSide;

    Square(double squareSide) {
        super("Square");
        this.squareSide = squareSide;
    }

    @Override
    double calculateArea() {
        return squareSide * squareSide;
    }

    @Override
    double calculatePerimeter() {
        return 4 * squareSide;
    }

    public double getSquareSide() {
        return squareSide;
    }
}
