package students.student_svetlana_seda.lesson_9.homework.level_4;

class RectangleTest {

    public static void main(String[] args) {
        RectangleTest test = new RectangleTest();
        test.calculateAreaTest();
        test.calculatePerimeterTest();

    }

    void calculateAreaTest() {
        Rectangle rectangle = new Rectangle("Rectangle", 5, 3);
        double expectedResult = 15.0;
        double realResult = rectangle.calculateArea();
        System.out.println("Rectangle area= " + rectangle.calculateArea());
        if (expectedResult == realResult) {
            System.out.println("Test PASSED!");
        } else {
            System.out.println("Test FAILED!");
        }
        System.out.println("__________________________________");
    }

    void calculatePerimeterTest() {
        Rectangle rectangle = new Rectangle("Rectangle", 5, 3);
        double expectedResult = 16.0;
        double realResult = rectangle.calculatePerimeter();
        System.out.println("Rectangler perimeter = " + rectangle.calculatePerimeter());
        if (expectedResult == realResult) {
            System.out.println("Test PASSED!");
        } else {
            System.out.println("Test FAILED!");
        }

    }

}
