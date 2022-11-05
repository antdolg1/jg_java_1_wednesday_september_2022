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
        int realResult = calculator.subtraction(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
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
    public void maxOfTwoNumbersTest1() {

        int firstNumber = 2;  // подготавливаем тестовые данные
        int secondNumber = 1;  // подготавливаем тестовые данные
        int expectedResult = 2;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Max  number test1 = OK");
        } else {
            System.out.println("Max number test1 = FAIL");
        }

    }

//второе число больше первого

    public void maxOfTwoNumbersTest2() {

        int firstNumber = 1;  // подготавливаем тестовые данные
        int secondNumber = 2;  // подготавливаем тестовые данные
        int expectedResult = 2;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Max  number test2 = OK");
        } else {
            System.out.println("Max number test2 = FAIL");
        }

    }

    //оба числа равны

    public void maxOfTwoNumbersTest3() {

        int firstNumber = 2;  // подготавливаем тестовые данные
        int secondNumber = 2;  // подготавливаем тестовые данные
        int expectedResult = 2;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Max  number test3 = OK");
        } else {
            System.out.println("Max number test3 = FAIL");
        }

    }

//первое число больше второго и третьего

    public void maxOfThreeNumbersTest1() {

        int firstNumber = 3;  // подготавливаем тестовые данные
        int secondNumber = 2;  // подготавливаем тестовые данные
        int thirdNumber = 1;  // подготавливаем тестовые данные
        int expectedResult = 3;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Max of three numbers test1 = OK");
        } else {
            System.out.println("Max of three number test1 = FAIL");
        }

    }

    //второе число больше первого и третьего
    public void maxOfThreeNumbersTest2() {

        int firstNumber = 2;  // подготавливаем тестовые данные
        int secondNumber = 3;  // подготавливаем тестовые данные
        int thirdNumber = 1;  // подготавливаем тестовые данные
        int expectedResult = 3;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Max of three numbers test2 = OK");
        } else {
            System.out.println("Max of three number test2 = FAIL");
        }

    }

    //третье число больше первого и второго

    public void maxOfThreeNumbersTest3() {

        int firstNumber = 2;  // подготавливаем тестовые данные
        int secondNumber = 2;  // подготавливаем тестовые данные
        int thirdNumber = 3;  // подготавливаем тестовые данные
        int expectedResult = 3;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Max of three numbers test3 = OK");
        } else {
            System.out.println("Max of three number test3 = FAIL");
        }

    }

    //первые два равны и больше третьего
    public void maxOfThreeNumbersTest4() {

        int firstNumber = 3;  // подготавливаем тестовые данные
        int secondNumber = 3;  // подготавливаем тестовые данные
        int thirdNumber = 1;  // подготавливаем тестовые данные
        int expectedResult = 3;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Max of three numbers test4 = OK");
        } else {
            System.out.println("Max of three number test4 = FAIL");
        }

    }

    //три числа равны
    public void maxOfThreeNumbersTest5() {

        int firstNumber = 3;  // подготавливаем тестовые данные
        int secondNumber = 3;  // подготавливаем тестовые данные
        int thirdNumber = 3;  // подготавливаем тестовые данные
        int expectedResult = 3;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Max of three numbers test5 = OK");
        } else {
            System.out.println("Max of three number test5 = FAIL");
        }

    }

    public static void main(String[] args) {

        CalculatorTest calculatorTest = new CalculatorTest();
//идея предложила, чтобы исправить ошибку добавить это(нижняя строка):
        CalculatorTest сalculatorTest = null;
        
        сalculatorTest.sumTest();
        сalculatorTest.subtructionTest();
        сalculatorTest.multiplicationTest();
        сalculatorTest.divisionTest();
        сalculatorTest.isEvenTest();
        calculatorTest.maxOfTwoNumbersTest1();
        calculatorTest.maxOfTwoNumbersTest2();
        calculatorTest.maxOfTwoNumbersTest3();
        calculatorTest.maxOfThreeNumbersTest1();
        calculatorTest.maxOfThreeNumbersTest2();
        calculatorTest.maxOfThreeNumbersTest3();
        calculatorTest.maxOfThreeNumbersTest4();
        calculatorTest.maxOfThreeNumbersTest5();

    }

}
