package students.student_zanna_klimova.lesson_4.level_4;

public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subtractionTest();
        calculatorTest.multiplicationTest();
        calculatorTest.divisionTest();
        calculatorTest.isEvenTest();
        calculatorTest.maxOfTwoNumbers();
        calculatorTest.maxOfTwoNumbers2();
        calculatorTest.maxOfTwoNumbers3();
        calculatorTest.maxOfThreeNumbers();
        calculatorTest.maxOfThreeNumbers2();
        calculatorTest.maxOfThreeNumbers3();
        // по аналогии реализуйте тесты для остальных методов
    }

    public void sumTest() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int expectedResult = 15;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void subtractionTest() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int expectedResult = 6;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.subtraction(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Subtraction test = OK");
        } else {
            System.out.println("Subtraction test = FAIL");
        }
    }

    public void multiplicationTest() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int expectedResult = 50;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.multiplication(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Multiplication test = OK");
        } else {
            System.out.println("Multiplication test = FAIL");
        }
    }

    public void divisionTest() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int expectedResult = 2;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        double realResult = calculator.division(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Division test = OK");
        } else {
            System.out.println("Division test = FAIL");
        }
    }

    public void isEvenTest() {
        int number = 19;  // подготавливаем тестовые данные
        boolean expectedResult = true;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("IsEvenTest test = OK");
        } else {
            System.out.println("IsEvenTest test = FAIL");
        }
    }

    public void maxOfTwoNumbers() {
        int firstNumber = 7;
        int secondNumber = 5;
        int expectedResult = 7;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("MaxOfTwoNumbers test = OK");
        } else {
            System.out.println("MaxOfTwoNumbers test = FAIL");
        }
    }

    public void maxOfTwoNumbers2() {
        int firstNumber = 7;
        int secondNumber = 8;
        int expectedResult = 8;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("MaxOfTwoNumbers test = OK");
        } else {
            System.out.println("MaxOfTwoNumbers test = FAIL");
        }
    }

    public void maxOfTwoNumbers3() {
        int firstNumber = 7;
        int secondNumber = 7;
        int expectedResult = 7;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("MaxOfTwoNumbers test = OK");
        } else {
            System.out.println("MaxOfTwoNumbers test = FAIL");
        }
    }

    public void maxOfThreeNumbers() {
        int firstNumber = 70;
        int secondNumber = 7;
        int thirdNumber = 9;
        int expectedResult = 70;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("MaxOfThreeNumbers test = OK");
        } else {
            System.out.println("MaxOfThreeNumbers test = FAIL");
        }
    }

    public void maxOfThreeNumbers2() {
        int firstNumber = 70;
        int secondNumber = 79;
        int thirdNumber = 9;
        int expectedResult = 70;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("MaxOfThreeNumbers test = OK");
        } else {
            System.out.println("MaxOfThreeNumbers test = FAIL");
        }
    }

    public void maxOfThreeNumbers3() {
        int firstNumber = 70;
        int secondNumber = 70;
        int thirdNumber = 9;
        int expectedResult = 70;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("MaxOfThreeNumbers test = OK");
        } else {
            System.out.println("MaxOfThreeNumbers test = FAIL");
        }
    }

}
