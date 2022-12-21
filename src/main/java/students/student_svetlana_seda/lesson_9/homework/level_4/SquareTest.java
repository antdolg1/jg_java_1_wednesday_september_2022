package students.student_svetlana_seda.lesson_9.homework.level_4;

class SquareTest {

    public static void main(String[] args) {
        SquareTest test = new SquareTest();
        test.calculateAreaTest();
        test.calculatePerimeterTest();

    }

    void calculateAreaTest() {
        Square square = new Square("Square", 5);
        double expectedResult = 25.0;
        double realResult = square.calculateArea();
        System.out.println(square.calculateArea());
        if (expectedResult == realResult) {
            System.out.println("Test PASSED!");
        } else {
            System.out.println("Test FAILED!");
        }
        System.out.println("__________________________________");
    }

    void calculatePerimeterTest() {
        Square square = new Square("Square", 5);
        double expectedResult = 20.0;
        double realResult = square.calculatePerimeter();
        System.out.println(square.calculatePerimeter());
        if (expectedResult == realResult) {
            System.out.println("Test PASSED!");
        } else {
            System.out.println("Test FAILED!");
        }

    }

}
