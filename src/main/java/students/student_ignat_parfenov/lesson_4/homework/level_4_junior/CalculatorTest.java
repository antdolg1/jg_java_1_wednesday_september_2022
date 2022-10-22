package students.student_ignat_parfenov.lesson_4.homework.level_4_junior;


public class CalculatorTest {

    public static void main(String[] args) {

        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subtractionTest();
        calculatorTest.multiplicationTest();
        calculatorTest.divisionTest();
        calculatorTest.isEvenTest();
        calculatorTest.maxOfTwoNumbers();

    }

    private void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 25;
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);

        if (realResult == expectedResult) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }


    private void subtractionTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.subtraction(firstNumber, secondNumber);

        if (realResult == expectedResult) {
            System.out.println("Subtraction test = OK");
        } else {
            System.out.println("Subtraction test = FAIL");
        }
    }

    private void multiplicationTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 50;
        Calculator calculator = new Calculator();
        int realResult = calculator.multiplication(firstNumber, secondNumber);

        if (realResult == expectedResult) {
            System.out.println("Multiplication test = OK");
        } else {
            System.out.println("Multiplication test = FAIL");
        }
    }

    private void divisionTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 2;
        Calculator calculator = new Calculator();
        int realResult = calculator.division(firstNumber, secondNumber);

        if (realResult == expectedResult) {
            System.out.println("Division test = OK");
        } else {
            System.out.println("Division test = FAIL");
        }
    }

    private void isEvenTest() {
        int number = 8;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number);
        if (realResult) {
            System.out.println("Even test = OK");
        } else {
            System.out.println("Even test = FAIL");
        }
    }

    private void maxOfTwoNumbers() {
        int firstNumber = 25;
        int secondNumber = 23;
        Calculator calculator = new Calculator();
    }
}
