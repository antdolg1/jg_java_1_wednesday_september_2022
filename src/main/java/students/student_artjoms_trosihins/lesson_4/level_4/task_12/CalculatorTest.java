package students.student_artjoms_trosihins.lesson_4.level_4.task_12;

class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest test = new CalculatorTest();
        test.sumTest();
        test.subTest();
        test.multiTest();
        test.divTest();
    }

    void sumTest() {
        Calculator victim = new Calculator();

        int firstNumber = 10;
        int secondNumber = 15;
        int expectedResult = 25;

        int actualResult = victim.sum(firstNumber, secondNumber);

        if (actualResult == expectedResult) {
            System.out.println("Test sumTest passed!");
        } else {
            System.out.println("Test sumTest failed");
            System.out.println("Expected result " + expectedResult + " actual result " + actualResult);
        }
    }

    void subTest() {
        Calculator victim = new Calculator();

        int firstNumber = 8;
        int secondNumber = 4;
        int expectedResult = 4;

        int realResult = victim.sub(firstNumber, secondNumber);

        if (expectedResult == realResult) {
            System.out.println("Test subTest passed!");
        } else {
            System.out.println("Test failed!");
            System.out.println("Expected result is " + expectedResult + " actual result" + realResult);
        }
    }

    void multiTest() {
        Calculator victim = new Calculator();

        int firstNumber = 8;
        int secondNumber = 4;
        int expectedResult = 32;

        int realResult = victim.multi(firstNumber, secondNumber);

        if (expectedResult == realResult) {
            System.out.println("Test multiTest passed!");
        } else {
            System.out.println("Test failed!");
            System.out.println("Expected result is " + expectedResult + " actual result" + realResult);
        }
    }

    void divTest() {
        Calculator victim = new Calculator();

        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 2;

        int realResult = victim.div(firstNumber, secondNumber);

        if (expectedResult == realResult) {
            System.out.println("Test divTest passed!");
        } else {
            System.out.println("Test failed!");
            System.out.println("Expected result is " + expectedResult + " actual result" + realResult);
        }
    }

}
