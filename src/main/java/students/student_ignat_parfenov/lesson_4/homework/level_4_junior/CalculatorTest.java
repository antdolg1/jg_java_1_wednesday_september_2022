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
        calculatorTest.maxOfThreeNumbers();

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
        int secondNumber = 25;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult > secondNumber) {
            System.out.println("TEST IS PASSED  - The first entered number " + firstNumber + " is bigger than the second number " + secondNumber);
        } else {
            System.out.println("TEST IS FAILED");
        }
        if (realResult > firstNumber) {
            System.out.println("TEST IS PASSED  - The second entered number " + secondNumber + " is bigger than the first number " + firstNumber);
        } else {
            System.out.println("TEST IS FAILED");
        }

        if (realResult > firstNumber) {
            System.out.println("TEST IS FAILED");
        } else if (realResult < firstNumber) {
            System.out.println("TEST IS FAILED");
        } else if (realResult > secondNumber) {
            System.out.println("TEST IS FAILED");
        } else if (realResult < secondNumber) {
            System.out.println("TEST IS FAILED");
        } else {
            System.out.println("TEST IS PASSED  - The entered numbers are equal");
        }
    }

    private void maxOfThreeNumbers() {
        int firstNumber = 25;
        int secondNumber = 28;
        int thirdNumber = 2;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult > secondNumber) {
            System.out.println("The first entered number " + firstNumber + " is bigger than other two entered numbers");
        } else if (realResult > thirdNumber) {
            System.out.println("The first entered number " + firstNumber + " is bigger than other two entered numbers");
        } else {
            System.out.println("TEST IS FAILED");
        }

        if (realResult > firstNumber) {
            System.out.println("TEST IS PASSED  - The second entered number " + secondNumber + " is bigger than other both entered numbers");
        } else {
            System.out.println("TEST IS FAILED");
        }
        if ((realResult > firstNumber) && (realResult > secondNumber)) {
            System.out.println("TEST IS PASSED  - The third entered number " + thirdNumber + " is bigger than other both entered numbers");
        } else {
            System.out.println("TEST IS FAILED");
        }
    }
}
