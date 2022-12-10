package students.student_zanna_klimova.lesson_9.level_4;

public class CircleTest {
    public static void main(String[] args) {
        CircleTest test = new CircleTest();
        test.calculateAreaTestFailed();
        test.calculateAreaTestPassed();
        test.calculatePerimeterTestFailed();
        test.calculatePerimeterTestPassed();
    }

    void calculateAreaTestFailed() {
        Circle circle = new Circle("Circle", 5);
        double expectedResult = 10;
        double actualResult = circle.calculateArea();
        if (expectedResult == actualResult) {
            System.out.println("Test PASSED!");
        } else {
            System.out.println("Test FAILED!");
        }
    }

    void calculateAreaTestPassed() {
        Circle circle = new Circle("Circle", 5);
        double expectedResult = 79.0;
        double actualResult = circle.calculateArea();
        if (expectedResult == actualResult) {
            System.out.println("Test PASSED!");
        } else {
            System.out.println("Test FAILED!");
        }
    }

    void calculatePerimeterTestFailed() {
        Circle circle = new Circle("Circle", 5);
        double expectedResult = 10;
        double actualResult = circle.calculatePerimeter();
        if (expectedResult == actualResult) {
            System.out.println("Test PASSED!");
        } else {
            System.out.println("Test FAILED!");
        }
    }

    void calculatePerimeterTestPassed() {
        Circle circle = new Circle("Circle", 5);
        double expectedResult = 31.0;
        double actualResult = circle.calculatePerimeter();
        if (expectedResult == actualResult) {
            System.out.println("Test PASSED!");
        } else {
            System.out.println("Test FAILED!");
        }
    }
}
