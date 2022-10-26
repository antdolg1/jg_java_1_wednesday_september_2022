package students.student_raivis_urbevics.lesson4_level4;

public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subtractionTest();
        calculatorTest.multiplicationTest();
        calculatorTest.divisionTest();
        calculatorTest.isEvenTest();
        calculatorTest.maxOfTwoNumbersTest();
        calculatorTest.maxOfThreeNumbersTest();

    }

    public void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void subtractionTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.subtraction(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("subtraction test = OK");
        } else {
            System.out.println("subtraction test = FAIL");
        }


    }

    public void multiplicationTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 50;
        Calculator calculator = new Calculator();
        int realResult = calculator.multiplication(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("multiplication test = OK");
        } else {
            System.out.println("multiplication test = FAIL");
        }

    }

    public void divisionTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 2;
        Calculator calculator = new Calculator();
        int realResult = calculator.division(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("division test = OK");
        } else {
            System.out.println("division test = FAIL");

        }
    }

    public void isEvenTest() {
        Calculator calculator = new Calculator();
        int number = 10;
        if (calculator.isEven(number)) {
            System.out.println("isEven test = OK");
        } else {
            System.out.println("isEven test=FAIL");
        }
    }

    public void maxOfTwoNumbersTest() {
        int firstNumber = 10;
        int secondNumber = 6;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfTwoNumbers test = OK");
        } else {
            System.out.println("maxOfTwoNumbers test = FAIL");

        }
    }

    public void maxOfThreeNumbersTest() {
        int num1 = 20;
        int num2 = 26;
        int num3 = 15;
        int expectedResult = 26;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(num1, num2, num3);
        if (realResult == expectedResult) {
            System.out.println("maxOfThreeNumbers test = OK");
        } else {
            System.out.println("maxOfThreeNumbers test = FAIL");
        }
    }
}




















