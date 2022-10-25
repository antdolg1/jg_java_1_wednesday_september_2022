package students.student_sergejs_kozinecs.lesson_4.level_4.Task_12;

class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subtractTest();
        calculatorTest.multiplyTest();
        calculatorTest.divideTest();
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
}