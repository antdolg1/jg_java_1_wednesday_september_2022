package students.student_zanna_klimova.lesson_9.level_4;

public class SquareTest {
    public static void main(String[] args) {
        SquareTest test = new SquareTest();
        test.calculateAreaFailed();
        test.calculateAreaPassed();
        test.calculatePerimeterFailed();
        test.calculatePerimeterPassed();
    }
        void calculateAreaPassed() {
            Square square = new Square("Square", 7);
            double expectedResult = 49.0;
            double actualResult = square.calculateArea();
            if (expectedResult == actualResult) {
                System.out.println("Test PASSED!");
            } else {
                System.out.println("Test FAILED!");
            }
        }

    void calculateAreaFailed() {
        Square square = new Square("Square", 7);
        double expectedResult = 55.0;
        double actualResult = square.calculateArea();
        if (expectedResult == actualResult) {
            System.out.println("Test PASSED!");
        } else {
            System.out.println("Test FAILED!");
        }

    }

    void calculatePerimeterPassed() {
        Square square = new Square("Square", 7);
        double expectedResult = 28.0;
        double actualResult = square.calculatePerimeter();
        if (expectedResult == actualResult) {
            System.out.println("Test PASSED!");
        } else {
            System.out.println("Test FAILED!");
        }
    }

    void calculatePerimeterFailed() {
        Square square = new Square("Square", 7);
        double expectedResult = 55.0;
        double actualResult = square.calculatePerimeter();
        if (expectedResult == actualResult) {
            System.out.println("Test PASSED!");
        } else {
            System.out.println("Test FAILED!");
        }

    }
}
