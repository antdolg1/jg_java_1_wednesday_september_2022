package students.student_ignat_parfenov.lesson_9.homework.Level_4_junior;

public class Triangle extends Shape {

    private double triangleFirstSide;
    private double triangleSecondSide;
    private double triangleThirdSide;

    Triangle(double triangleFirstSide, double triangleSecondSide, double triangleThirdSide) {
        super("Triangle");
        this.triangleFirstSide = triangleFirstSide;
        this.triangleSecondSide = triangleSecondSide;
        this.triangleThirdSide = triangleThirdSide;
        this.triangleHalfPerimeter = triangleHalfPerimeter();
    }

    private double triangleHalfPerimeter;

    double triangleHalfPerimeter() {
        return triangleHalfPerimeter = (triangleFirstSide + triangleSecondSide + triangleThirdSide) / 2;
    }

    public double getTriangleHalfPerimeter() {
        return triangleHalfPerimeter;
    }

    @Override
    double calculateArea() {
        return Math.sqrt(triangleHalfPerimeter * (triangleHalfPerimeter - triangleFirstSide) * (triangleHalfPerimeter - triangleSecondSide) * (triangleHalfPerimeter - triangleThirdSide));
    }

    @Override
    double calculatePerimeter() {
        return triangleFirstSide + triangleSecondSide + triangleThirdSide;
    }

    public double getTriangleFirstSide() {
        return triangleFirstSide;
    }

    public double getTriangleSecondSide() {
        return triangleSecondSide;
    }

    public double getTriangleThirdSide() {
        return triangleThirdSide;
    }
}
