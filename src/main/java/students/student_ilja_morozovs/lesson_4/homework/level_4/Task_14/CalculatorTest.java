package students.student_ilja_morozovs.lesson_4.homework.level_4.Task_14;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
//        calculatorTest.sumTest();
//        calculatorTest.subtractionTest();
//        calculatorTest.increaseTest();
//        calculatorTest.divisionTest();
//        calculatorTest.isEvenTest();
        calculatorTest.maxOfTwoNumbersTestFirstNumberIsLarger();
        calculatorTest.maxOfTwoNumbersTestSecondNumberIsLarger();
        calculatorTest.maxOfTwoNumbersTestTwoNumbersAreEqual();
    }

    void sumTest() {
        int numberOne = 10;
        int numberTwo = 5;
        int result = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(numberOne, numberTwo);
        if (realResult == result) {
            System.out.println("Sum TEST = OK");
        } else {
            System.out.println("Sum TEST = FAIL");
        }
    }

    void subtractionTest() {
        int numberOne = 10;
        int numberTwo = 5;
        int result = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.subtraction(numberOne, numberTwo);
        if (realResult == result) {
            System.out.println("Sub TEST = OK");
        } else {
            System.out.println("Sub TEST = FAIL");
        }
    }

    void increaseTest() {
        int numberOne = 10;
        int numberTwo = 5;
        int result = 50;
        Calculator calculator = new Calculator();
        int realResult = calculator.increase(numberOne, numberTwo);
        if (realResult == result) {
            System.out.println("Inc TEST = OK");
        } else {
            System.out.println("Inc TEST = FAIL");
        }
    }

    void divisionTest() {
        int numberOne = 10;
        int numberTwo = 5;
        int result = 2;
        Calculator calculator = new Calculator();
        int realResult = calculator.division(numberOne, numberTwo);
        if (realResult == result) {
            System.out.println("Dec TEST = OK");
        } else {
            System.out.println("Dec TEST = FAIL");
        }
    }

    void isEvenTest() {
        int number = 10;
        boolean result = true;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number);
        if (realResult == result) {
            System.out.println("Boolean TEST = OK");
        } else {
            System.out.println("Boolean TEST = FAIL");
        }
    }

    void maxOfTwoNumbersTestFirstNumberIsLarger() {
        int firstNumber = 10;
        int secondNumber = 1;
        int result = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == result) {
            System.out.println("Max numbers TEST = OK");
        } else {
            System.out.println("Max numbers TEST = FAIL");
        }
    }

    void maxOfTwoNumbersTestSecondNumberIsLarger() {
        int firstNumber = 10;
        int secondNumber = 15;
        int result = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == result) {
            System.out.println("Max numbers TEST = OK");
        } else {
            System.out.println("Max numbers TEST = FAIL");
        }
    }

    void maxOfTwoNumbersTestTwoNumbersAreEqual() {
        int firstNumber = 117;
        int secondNumber = 117;
        int result = 117;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == result) {
            System.out.println("Max two numbers TEST = OK");
        } else {
            System.out.println("Max two numbers TEST = FAIL");
        }
    }
}
