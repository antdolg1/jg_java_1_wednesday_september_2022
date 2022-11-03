package students.student_svetlana_seda.lesson_4.homework.level_4;

class CalculatorTest {
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
            System.out.println("Subtruction Test = OK");
        } else {
            System.out.println("Subtruction Test = FAIL");
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
            System.out.println("Multiplication Test = OK");
        } else {
            System.out.println("Multiplication Test = FAIL");
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
            System.out.println("DivisionTest = OK");
        } else {
            System.out.println("DivisionTest = FAIL");
        }

    }

    //IsEvenTest
    public void isEvenTest() {

        int number = 2;
        boolean expectedResult = true;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println(" Even Test = OK");
        } else {
            System.out.println("Even Test = FAIL");
        }

    }

    //первое число больше второго
    public void maxOfTwoNumbersTest() {

        int firstNumber = 2;  // подготавливаем тестовые данные
        int secondNumber = 1;  // подготавливаем тестовые данные
        int expectedResult = 2;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Max  number test = OK");
        } else {
            System.out.println("Max number test = FAIL");
        }

    }

//второе число больше первого

    public void maxOfTwoNumbersTest() {

        int firstNumber = 1;  // подготавливаем тестовые данные
        int secondNumber = 2;  // подготавливаем тестовые данные
        int expectedResult = 2;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Max  number test = OK");
        } else {
            System.out.println("Max number test = FAIL");
        }

    }

    //оба числа равны

    public void maxOfTwoNumbersTest() {

        int firstNumber = 2;  // подготавливаем тестовые данные
        int secondNumber = 2;  // подготавливаем тестовые данные
        int expectedResult = 2;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Max  number test = OK");
        } else {
            System.out.println("Max number test = FAIL");
        }

    }

//первое число больше второго и третьего

    public void maxOfThreeNumbersTest() {

        int firstNumber = 3;  // подготавливаем тестовые данные
        int secondNumber = 2;  // подготавливаем тестовые данные
        int thirdNumber = 1;  // подготавливаем тестовые данные
        int expectedResult = 3;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Max of three numbers test = OK");
        } else {
            System.out.println("Max of three number test = FAIL");
        }

    }

    //второе число больше первого и третьего
    public void maxOfThreeNumbersTest() {

        int firstNumber = 2;  // подготавливаем тестовые данные
        int secondNumber = 3;  // подготавливаем тестовые данные
        int thirdNumber = 1;  // подготавливаем тестовые данные
        int expectedResult = 3;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Max of three numbers test = OK");
        } else {
            System.out.println("Max of three number test = FAIL");
        }

    }

    //третье число больше первого и второго

    public void maxOfThreeNumbersTest() {

        int firstNumber = 2;  // подготавливаем тестовые данные
        int secondNumber = 2;  // подготавливаем тестовые данные
        int thirdNumber = 3;  // подготавливаем тестовые данные
        int expectedResult = 3;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Max of three numbers test = OK");
        } else {
            System.out.println("Max of three number test = FAIL");
        }

    }

    //первые два равны и больше третьего
    public void maxOfThreeNumbersTest() {

        int firstNumber = 3;  // подготавливаем тестовые данные
        int secondNumber = 3;  // подготавливаем тестовые данные
        int thirdNumber = 1;  // подготавливаем тестовые данные
        int expectedResult = 3;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Max of three numbers test = OK");
        } else {
            System.out.println("Max of three number test = FAIL");
        }

    }

    //три числа равны
    public void maxOfThreeNumbersTest() {

        int firstNumber = 3;  // подготавливаем тестовые данные
        int secondNumber = 3;  // подготавливаем тестовые данные
        int thirdNumber = 3;  // подготавливаем тестовые данные
        int expectedResult = 3;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Max of three numbers test = OK");
        } else {
            System.out.println("Max of three number test = FAIL");
        }

    }

    public static void main(String[] args) {

        CalculatorTest calculatorTest = new CalculatorTest();
        CalculatorTest.sumTest();
        CalculatorTest.subtructionTest();
        CalculatorTest.multiplicationTest();
        CalculatorTest.divisionTest();
        CalculatorTest.isEvenTest();
        CalculatorTest.maxOfTwoNumbersTest();
        CalculatorTest.maxOfThreeNumbersTest();

    }

}
