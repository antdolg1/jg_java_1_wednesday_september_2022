package students.student_zanna_klimova.lesson_9.level_4;

public class TriangleTest {
    public static void main(String[] args) {
        TriangleTest test = new TriangleTest();
        test.calculateAreaFailed();
        test.calculateAreaPassed();
        test.calculatePerimeterPassed();
        test.calculatePerimeterFailed();
    }

    void calculateAreaPassed() {
        Triangle triangle = new Triangle("Triangle", 10, 2);
        double expectedResult = 10.0;
        double actualResult = triangle.calculateArea();
        if (expectedResult == actualResult) {
            System.out.println("Test PASSED!");
        } else {
            System.out.println("Test FAILED!");
        }
    }

    void calculateAreaFailed() {
        Triangle triangle = new Triangle("Triangle", 10, 2);
        double expectedResult = 1.0;
        double actualResult = triangle.calculateArea();
        if (expectedResult == actualResult) {
            System.out.println("Test PASSED!");
        } else {
            System.out.println("Test FAILED!");
        }
    }

    void calculatePerimeterPassed() {
        Triangle triangle = new Triangle("Triangle", 2, 5, 6);
        double expectedResult = 60.0;
        double actualResult = triangle.calculatePerimeter();
        if (expectedResult == actualResult) {
            System.out.println("Test PASSED!");
        } else {
            System.out.println("Test FAILED!");
        }
    }

    void calculatePerimeterFailed() {
        Triangle triangle = new Triangle("Triangle", 2, 5, 6);
        double expectedResult = 6.0;
        double actualResult = triangle.calculatePerimeter();
        if (expectedResult == actualResult) {
            System.out.println("Test PASSED!");
        } else {
            System.out.println("Test FAILED!");
        }
    }
}
