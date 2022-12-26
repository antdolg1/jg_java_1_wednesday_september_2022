package students.student_sergejs_kozinecs.lesson_4.level_7.Task_24;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest1();
        calculatorTest.isEvenTest2();
    }

    void printTestResult(String title, boolean result) {
        if (result) {
            System.out.println(title + " test = OK");
        } else {
            System.out.println(title + " test = FAIL");
        }
    }

    public void sumTest() {
        int firstNumber = 35;
        int secondNumber = 40;
        Calculator calculator = new Calculator();
        int result = calculator.sum(firstNumber, secondNumber);

        printTestResult("Sum", result == 75);
    }

    public void subTest() {
        int firstNumber = 35;
        int secondNumber = 15;
        Calculator calculator = new Calculator();
        int result = calculator.sub(firstNumber, secondNumber);

        printTestResult("Sub", result == 20);
    }

    public void mulTest() {
        int firstNumber = 5;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.mul(firstNumber, secondNumber);

        printTestResult("Mul", result == 25);
    }

    public void divTest() {
        int firstNumber = 40;
        int secondNumber = 8;
        Calculator calculator = new Calculator();
        int result = calculator.div(firstNumber, secondNumber);

        printTestResult("Div", result == 5);
    }

    public void isEvenTest1() {
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(40);

        printTestResult("isEven", result);
    }

    public void isEvenTest2() {
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(41);

        printTestResult("isEven", result == false);
    }
}
