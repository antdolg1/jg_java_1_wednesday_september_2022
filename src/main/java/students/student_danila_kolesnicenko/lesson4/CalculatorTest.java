package students.student_danila_kolesnicenko.lesson4;

class CalculatorTest {
    public static void main(String[] args) {

        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.divTest();
        calculatorTest.mulTest();
        calculatorTest.evenTest();
        calculatorTest.MaxOfTwoNumbersTest();
        calculatorTest.MaxOfTwoNumbersTest2();
        calculatorTest.MaxOfTwoNumbersTest3();
        calculatorTest.MaxOfThreeNumbersTest();
        calculatorTest.MaxOfThreeNumbersTest2();
        calculatorTest.MaxOfThreeNumbersTest3();

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

    public void subTest() {

        int firstNumber = 6;
        int secondNumber = 3;
        int expectedResult = 3;
        Calculator calculator = new Calculator();
        int realResult = calculator.sub(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sub test = OK");
        } else {
            System.out.println("Sub test = FAIL");
        }
    }

    public void divTest() {

        int firstNumber = 3;
        int secondNumber = 2;
        int expectedResult = 1;
        Calculator calculator = new Calculator();
        int realResult = calculator.div(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Div test = OK");
        } else {
            System.out.println("Div test = FAIL");
        }
    }

    public void mulTest() {
        int firstNumber = 5;
        int secondNumber = 2;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.mul(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Add test = OK");
        } else {
            System.out.println("Add test = FAIL");
        }

    }

    public void evenTest() {
        int number = 2;
        boolean expectedResult = true;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number);
        if (realResult == expectedResult) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }


    }

    public void MaxOfTwoNumbersTest() {
        int firstNumber = 3;
        int secondNumber = 2;
        int expectedResult = 3;
        Calculator calculator = new Calculator();
        int realResult = calculator.MaxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("OK");
        }


    }

    public void MaxOfTwoNumbersTest2() {
        int firstNumber = 2;
        int secondNumber = 3;
        int expectedResult = 3;
        Calculator calculator = new Calculator();
        int realResult = calculator.MaxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("OK");
        }


    }

    public void MaxOfTwoNumbersTest3() {
        int firstNumber = 3;
        int secondNumber = 3;
        int expectedResult = 3;
        Calculator calculator = new Calculator();
        int realResult = calculator.MaxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("OK");
        }

    }

    public void MaxOfThreeNumbersTest() {
        int firstNumber = 3;
        int secondNumber = 2;
        int thirdNumber = 1;
        int expectedResult = 3;
        Calculator calculator = new Calculator();
        int realResult = calculator.MaxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("OK");
        }
    }

    public void MaxOfThreeNumbersTest2() {
        int firstNumber = 1;
        int secondNumber = 3;
        int thirdNumber = 2;
        int expectedResult = 3;
        Calculator calculator = new Calculator();
        int realResult = calculator.MaxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("OK");
        }
    }

    public void MaxOfThreeNumbersTest3() {
        int firstNumber = 1;
        int secondNumber = 2;
        int thirdNumber = 3;
        int expectedResult = 3;
        Calculator calculator = new Calculator();
        int realResult = calculator.MaxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("OK");
        }
    }
}
