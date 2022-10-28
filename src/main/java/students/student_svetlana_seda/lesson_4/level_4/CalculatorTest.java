package students.student_svetlana_seda.lesson_4.level_4;

public class CalculatorTest {

    public static void main(String[] args) {

        CalculatorTest calculatorTest = new CalculatorTest();
        CalculatorTest.sumTest();
        CalculatorTest.subtructionTest();
        CalculatorTest.multiplicationTest();
        CalculatorTest.divisionTest();
        CalculatorTest.isEvenTest();
        CalculatorTest.maxNumberOfTwoNumbersTest();
        CalculatorTest.biggestOfThreeNumbersTest();
        CalculatorTest.firstNumberTheBiggestTest();
        CalculatorTest.secondNumberTheBiggestTest();
        CalculatorTest.thirdNumberTheBiggestTest();
        CalculatorTest.firstAndSecondEqualBiggestTest();
        CalculatorTest.allEqualsTest();
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

    //subtruction test
    public void subtructionTest() {

        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int expectedResult = 5;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.subtruction(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FAIL");
        }
    }

    //multiplication test
    public void multiplicationTest() {

        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int expectedResult = 50;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.multiplication(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FAIL");
        }

    }

    //division test
    public void divisionTest() {

        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int expectedResult = 2;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.division(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FAIL");
        }

    }

    //IsEvenTest
    public void isEvenTest() {

        int number = 2;
        boolean expectedResult = true;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FAIL");
        }

    }

    //maxNumberOfTwoNumbersTest
    public void maxNumberOfTwoNumbersTest() {

        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int expectedResult = 10;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxNumberOfTwoNumbers(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FAIL");
        }

    }

    //biggestOfThreeNumbersTest
    public void biggestOfThreeNumbersTest() {

        int firstNumber = 2;
        int secondNumber = 4;
        int thirdNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.biggestOfThreeNumbers(firstNumber, secondNumber, thirdNumber);

        if (realResult == expectedResult) {
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FAIL");
        }

    }

    //- первое число больше второго и третьего
    public void firstNumberTheBiggestTest() {

        int firstNumber = 4;
        int secondNumber = 2;
        int thirdNumber = 3;
        int expectedResult = 4;
        Calculator calculator = new Calculator();
        int realResult = calculator.firstNumberTheBiggest(firstNumber, secondNumber, thirdNumber);

        if (realResult == expectedResult) {
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FAIL");
        }

    }

    //второе число больше первого и третьего
    public void secondNumberTheBiggestTest() {

        int firstNumber = 2;
        int secondNumber = 4;
        int thirdNumber = 3;
        int expectedResult = 4;
        Calculator calculator = new Calculator();
        int realResult = calculator.secondNumberTheBiggest(firstNumber, secondNumber, thirdNumber);

        if (realResult == expectedResult) {
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FAIL");
        }

    }

    // третье число больше первого и второго
    public void thirdNumberTheBiggestTest() {

        int firstNumber = 1;
        int secondNumber = 2;
        int thirdNumber = 4;
        int expectedResult = 4;
        Calculator calculator = new Calculator();
        int realResult = calculator.thirdNumberTheBiggest(firstNumber, secondNumber, thirdNumber);

        if (realResult == expectedResult) {
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FAIL");
        }

    }

    //первые два равны и больше третьего
    public void firstAndSecondEqualBiggestTest() {

        int firstNumber = 4;
        int secondNumber = 4;
        int thirdNumber = 3;
        int expectedResult = 4;
        Calculator calculator = new Calculator();
        int realResult = calculator.firstAndSecondEqualBiggest(firstNumber, secondNumber, thirdNumber);

        if (realResult == expectedResult) {
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FAIL");
        }

    }

    // три числа равны
    public void allEqualsTest() {

        int firstNumber = 4;
        int secondNumber = 2;
        int thirdNumber = 3;

        int expectedResult = 4;
        Calculator calculator = new Calculator();
        int realResult = calculator.allEquals(firstNumber, secondNumber, thirdNumber);

        if (realResult == expectedResult) {
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FAIL");
        }

    }

}
