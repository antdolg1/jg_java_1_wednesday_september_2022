package students.student_oskars_popens.lesson_9.level_4_5;

class Rectangle extends Shape {
    private double sideOne;
    private double sideTwo;

    Rectangle(double sideOne, double sideTwo) {
        super("Rectangle");
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    @Override
    double calculateArea() {
        return sideTwo * sideOne;
    }

    @Override
    double calculatePerimeter() {
        return 2*(sideTwo + sideOne);
    }

    public double getSideOne() {
        return sideOne;
    }

    public double getSideTwo() {
        return sideTwo;
    }
}
