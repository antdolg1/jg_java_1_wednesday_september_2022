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
        calculatorTest.allThreeNumbersAreEqual();

    }

    // Тестовый сценарий - проверка результата сложения двух чисел //
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

    // Тестовый сценарий - проверка результата вычитания двух чисел //
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

    // Тестовый сценарий - проверка результата умножения //
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

    // Тестовый сценарий - проверка результата деления //
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

    // Тестовый сценарий - четное ли число //
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

    // Тестовый сценарий - наибольшое из двух чисел //
    private void maxOfTwoNumbers() {
        int firstNumber = 10;
        int secondNumber = 2;
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
// Тестовый сценарий если два числа равны //
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

    // Тестовый сценарий - максимальное из трех чисел //
    private void maxOfThreeNumbers() {
        int firstNumber = 12;
        int secondNumber = 13;
        int thirdNumber = 16;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if ((realResult > secondNumber) && (realResult > thirdNumber)) {
            System.out.println("The first entered number " + firstNumber + " is bigger than other two entered numbers");
        } else {
            System.out.println("TEST IS FAILED");
        } // the second number is maximum //
        if ((realResult > firstNumber) && (realResult > thirdNumber)) {
            System.out.println("TEST IS PASSED  - The second entered number " + secondNumber + " is bigger than other both entered numbers");
        } else {
            System.out.println("TEST IS FAILED");
        } // the third number is maximum //
        if ((realResult > firstNumber) && (realResult > secondNumber)) {
            System.out.println("TEST IS PASSED  - The third entered number " + thirdNumber + " is bigger than other both entered numbers");
        } else {
            System.out.println("TEST IS FAILED");
        }
    }

    // Тестовый сценарий - все три введенных значения равны //
    public void allThreeNumbersAreEqual() {
        double firstNumber = 15;
        double secondNumber = 15;
        double thirdNumber = 16;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.allThreeNumbersAreEqual(firstNumber, secondNumber, thirdNumber);
        if (realResult) {
            System.out.println("Equal test is OK! All three entered numbers are equal.");
        } else {
            System.out.println("Equal test = FAILED!");
        }
    }
}
