package students.student_ignat_parfenov.lesson_9.homework.Level_4_junior;

public class Rectangle extends Shape {

    private double sideOne;
    private double sideTwo;

    Rectangle(double sideOne, double sideTwo) {
        super("Rectangle");
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    @Override
    double calculateArea() {
        return sideOne * sideTwo;
    }

    @Override
    double calculatePerimeter() {
        return 2 * sideOne + 2 * sideTwo;
    }

    public double getSideOne() {
        return sideOne;
    }

    public double getSideTwo() {
        return sideTwo;
    }
}



