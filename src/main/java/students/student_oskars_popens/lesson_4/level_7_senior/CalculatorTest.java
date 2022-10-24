package students.student_oskars_popens.lesson_4.level_7_senior;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();

        calculatorTest.sumTest(35, 40, 75);
        calculatorTest.subTest(35, 15, 20);
        calculatorTest.mulTest(5, 5, 25);
        calculatorTest.divTest(40, 8, 5);
        calculatorTest.isEvenTest(40, true);
    }

    void sumTest(int firstNumber, int secondNumber, int expectedResult) {
        Calculator calculator = new Calculator();
        int result = calculator.sum(firstNumber, secondNumber);
        testResult(result == expectedResult, "Sum test");
    }

    void subTest(int firstNumber, int secondNumber, int expectedResult) {
        Calculator calculator = new Calculator();
        int result = calculator.sub(firstNumber, secondNumber);
        testResult(result == expectedResult, "Sub test");
    }

    void mulTest(int firstNumber, int secondNumber, int expectedResult) {
        Calculator calculator = new Calculator();
        int result = calculator.mul(firstNumber, secondNumber);
        testResult(result == expectedResult, "Mul test");
    }

    void divTest(int firstNumber, int secondNumber, int expectedResult) {
        Calculator calculator = new Calculator();
        int result = calculator.div(firstNumber, secondNumber);
        testResult(result == expectedResult, "Div test");
    }

    void isEvenTest(int testValue, boolean expectedResult) {
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(testValue);
        testResult(result == expectedResult, "isEven test");
    }

    void testResult(boolean checkTest, String testingString) {
        if (checkTest) {
            System.out.println(testingString + " = OK");
        } else {
            System.out.println(testingString + " = FAIL");
        }
    }
}
