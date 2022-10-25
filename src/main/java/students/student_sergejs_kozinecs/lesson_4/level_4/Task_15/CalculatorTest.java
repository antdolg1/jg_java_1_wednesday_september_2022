package students.student_sergejs_kozinecs.lesson_4.level_4.Task_15;

class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subtractTest();
        calculatorTest.multiplyTest();
        calculatorTest.divideTest();
        calculatorTest.isEvenTest();
        calculatorTest.maxOfTwoNumbersTest();
        calculatorTest.firstNumberIsHighestTest();
        calculatorTest.secondNumberIsHighestTest();
        calculatorTest.thirdNumberIsHighestTest();
        calculatorTest.IsHighestTest();
        calculatorTest.IsHighestTest2();
        calculatorTest.IsHighestTest3();
        calculatorTest.AllEqualIsHighestTest();
        // по аналогии реализуйте тесты для остальных методов
    }

    public void sumTest() {
        int firstNumber = 10; // подготавливаем тестовые данные
        int secondNumber = 5; // подготавливаем тестовые данные
        int expectedResult = 15; // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber); // вызываем продакшен код, который хотим
                                                                    // протестировать
        if (realResult == expectedResult) { // проверяем правильно ли сработал тестируемый код
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void subtractTest() {
        int firstNumber = 10; // подготавливаем тестовые данные
        int secondNumber = 5; // подготавливаем тестовые данные
        int expectedResult = 5; // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.subtract(firstNumber, secondNumber); // вызываем продакшен код, который хотим
        // протестировать
        if (realResult == expectedResult) { // проверяем правильно ли сработал тестируемый код
            System.out.println("Substraction test = OK");
        } else {
            System.out.println("Substraction test = FAIL");
        }
    }

    public void multiplyTest() {
        int firstNumber = 2; // подготавливаем тестовые данные
        int secondNumber = 5; // подготавливаем тестовые данные
        int expectedResult = 10; // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.multiply(firstNumber, secondNumber); // вызываем продакшен код, который хотим
        // протестировать
        if (realResult == expectedResult) { // проверяем правильно ли сработал тестируемый код
            System.out.println("Multiplication test = OK");
        } else {
            System.out.println("Multiplication test = FAIL");
        }
    }

    public void divideTest() {
        int firstNumber = 10; // подготавливаем тестовые данные
        int secondNumber = 5; // подготавливаем тестовые данные
        int expectedResult = 2; // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.divide(firstNumber, secondNumber); // вызываем продакшен код, который хотим
                                                                       // протестировать
        if (realResult == expectedResult) { // проверяем правильно ли сработал тестируемый код
            System.out.println("Division test = OK");
        } else {
            System.out.println("Division test = FAIL");
        }
    }

    public void isEvenTest() {
        int number = 10;
        boolean expectedResult = true;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number);

        if (realResult == expectedResult) {
            System.out.println("isEven test = OK");
        } else {
            System.out.println("isEven test = FAIL");
        }
    }

    public void maxOfTwoNumbersTest() {
        int firstNumber = 10;
        int secondNumber = 15;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);

        if (realResult == expectedResult) {
            System.out.println("maxOfTwoNumbers test = OK");
        } else {
            System.out.println("maxOfTwoNumbers test = FAIL");
        }
    }

    public void firstNumberIsHighestTest() {
        int firstNumber = 20;
        int secondNumber = 15;
        int thirdNumber = 1;

        int expectedResult = 20;
        Calculator calculator = new Calculator();
        int realResult = calculator.isHighest(firstNumber, secondNumber, thirdNumber);

        if (realResult == expectedResult) {
            System.out.println("isHighest first number test = OK");
        } else {
            System.out.println("isHighest first number test = FAIL");
        }
    }

    public void secondNumberIsHighestTest() {
        int firstNumber = 2;
        int secondNumber = 15;
        int thirdNumber = 1;

        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.isHighest(firstNumber, secondNumber, thirdNumber);

        if (realResult == expectedResult) {
            System.out.println("isHighest second number test = OK");
        } else {
            System.out.println("isHighest second number test = FAIL");
        }
    }

    public void thirdNumberIsHighestTest() {
        int firstNumber = 2;
        int secondNumber = 4;
        int thirdNumber = 1222;

        int expectedResult = 1222;
        Calculator calculator = new Calculator();
        int realResult = calculator.isHighest(firstNumber, secondNumber, thirdNumber);

        if (realResult == expectedResult) {
            System.out.println("isHighest third number test = OK");
        } else {
            System.out.println("isHighest third number test = FAIL");
        }
    }

    public void IsHighestTest() {
        int firstNumber = 4;
        int secondNumber = 4;
        int thirdNumber = 1;

        int expectedResult = 4;
        Calculator calculator = new Calculator();
        int realResult = calculator.isHighest(firstNumber, secondNumber, thirdNumber);

        if (realResult == expectedResult) {
            System.out.println("isHighest first = second > third test = OK");
        } else {
            System.out.println("isHighest first = second > third test = FAIL");
        }
    }

    public void IsHighestTest2() {
        int firstNumber = 1;
        int secondNumber = 4;
        int thirdNumber = 4;

        int expectedResult = 4;
        Calculator calculator = new Calculator();
        int realResult = calculator.isHighest(firstNumber, secondNumber, thirdNumber);

        if (realResult == expectedResult) {
            System.out.println("isHighest second = third > first test = OK");
        } else {
            System.out.println("isHighest second = third > first test = FAIL");
        }
    }

    public void IsHighestTest3() {
        int firstNumber = 4;
        int secondNumber = 1;
        int thirdNumber = 4;

        int expectedResult = 4;
        Calculator calculator = new Calculator();
        int realResult = calculator.isHighest(firstNumber, secondNumber, thirdNumber);

        if (realResult == expectedResult) {
            System.out.println("isHighest first = third > second test = OK");
        } else {
            System.out.println("isHighest first = third > second test = FAIL");
        }
    }

    public void AllEqualIsHighestTest() {
        int firstNumber = 4;
        int secondNumber = 4;
        int thirdNumber = 4;

        int expectedResult = 4;
        Calculator calculator = new Calculator();
        int realResult = calculator.isHighest(firstNumber, secondNumber, thirdNumber);

        if (realResult == expectedResult) {
            System.out.println("isHighest all equal test = OK");
        } else {
            System.out.println("isHighest all equal test = FAIL");
        }
    }
}