package students.student_zanna_klimova.lesson_9.level_4;

public class RectangleTest {
    public static void main(String[] args) {
        RectangleTest test = new RectangleTest();
        test.calculateAreaFailed();
        test.calculateAreaPassed();
        test.calculatePerimeterTestFailed();
        test.calculatePerimeterTestPassed();
    }

    void calculateAreaPassed() {
        Rectangle rectangle = new Rectangle("Rectangle", 2, 6);
        double expectedResult = 12.0;
        double actualResult = rectangle.calculateArea();
        if (expectedResult == actualResult) {
            System.out.println("Test PASSED!");
        } else {
            System.out.println("Test FAILED!");
        }
    }

    void calculateAreaFailed() {
        Rectangle rectangle = new Rectangle("Rectangle", 2, 6);
        double expectedResult = 55.0;
        double actualResult = rectangle.calculateArea();
        if (expectedResult == actualResult) {
            System.out.println("Test PASSED!");
        } else {
            System.out.println("Test FAILED!");
        }
    }

    void calculatePerimeterTestFailed() {
        Rectangle rectangle = new Rectangle("Rectangle", 2, 6);
        double expectedResult = 10;
        double actualResult = rectangle.calculatePerimeter();
        if (expectedResult == actualResult) {
            System.out.println("Test PASSED!");
        } else {
            System.out.println("Test FAILED!");
        }
    }

    void calculatePerimeterTestPassed() {
        Rectangle rectangle = new Rectangle("Rectangle", 2, 6);
        double expectedResult = 16.0;
        double actualResult = rectangle.calculatePerimeter();
        if (expectedResult == actualResult) {
            System.out.println("Test PASSED!");
        } else {
            System.out.println("Test FAILED!");
        }
    }
}
