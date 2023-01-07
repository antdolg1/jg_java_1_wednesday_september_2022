package students.student_svetlana_seda.lesson_9.homework.level_4;

class TriangleTest {

    public static void main(String[] args) {
        TriangleTest test = new TriangleTest();
        test.calculateAreaTest();
        test.calculatePerimeterTest();

    }

    void calculateAreaTest() {
        Triangle triangle = new Triangle("Triangle", 2, 3, 4, 5, 4);
        double expectedResult = 10.0;
        double realResult = triangle.calculateArea();
        System.out.println(triangle.calculateArea());
        if (expectedResult == realResult) {
            System.out.println("Test PASSED!");
        } else {
            System.out.println("Test FAILED!");
        }
        System.out.println("__________________________________");
    }

    void calculatePerimeterTest() {
        Triangle triangle = new Triangle("TriangleTest", 2, 3, 4, 5, 4);
        double expectedResult = 9.0;
        double realResult = triangle.calculatePerimeter();
        System.out.println(triangle.calculatePerimeter());
        if (expectedResult == realResult) {
            System.out.println("Test PASSED!");
        } else {
            System.out.println("Test FAILED!");
        }

    }

}
