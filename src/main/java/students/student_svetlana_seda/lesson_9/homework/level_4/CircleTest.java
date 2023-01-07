package students.student_svetlana_seda.lesson_9.homework.level_4;

class CircleTest {

    public static void main(String[] args) {
        CircleTest test = new CircleTest();
        test.calculateAreaTest();
        test.calculatePerimeterTest();

    }

    void calculateAreaTest() {
        Circle circle = new Circle("Circle", 5);
        double expectedResult = 78.53981633974483;
        double realResult = circle.calculateArea();
        System.out.println(circle.calculateArea());
        if (expectedResult == realResult) {
            System.out.println("Test PASSED!");
        } else {
            System.out.println("Test FAILED!");
        }
        System.out.println("__________________________________");
    }

    void calculatePerimeterTest() {
        Circle circle = new Circle("Circle", 5);
        double expectedResult = 31.41592653589793;
        double realResult = circle.calculatePerimeter();
        System.out.println(circle.calculatePerimeter());
        if (expectedResult == realResult) {
            System.out.println("Test PASSED!");
        } else {
            System.out.println("Test FAILED!");
        }

    }

}
