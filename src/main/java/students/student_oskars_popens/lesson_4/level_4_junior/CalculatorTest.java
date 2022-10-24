package students.student_oskars_popens.lesson_4.level_4_junior;

class CalculatorTest {

    void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 15;

        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sum test = Ok");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    void minusTest() {
        int firstNumber = 73;
        int secondNumber = 13;
        int expectedResult = 60;

        Calculator calculator = new Calculator();
        int realResult = calculator.minus(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Minus test = Ok");
        } else {
            System.out.println("Minus test = FAIL");
        }
    }

    void divideTest() {
        int firstNumber = 55;
        int secondNumber = 11;
        int expectedResult = 5;

        Calculator calculator = new Calculator();
        int realResult = calculator.divide(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Divide test = Ok");
        } else {
            System.out.println("Divide test = FAIL");
        }
    }

    void multiplyTest() {
        int firstNumber = 11;
        int secondNumber = 22;
        int expectedResult = 242;

        Calculator calculator = new Calculator();
        int realResult = calculator.multiply(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Multiply test = Ok");
        } else {
            System.out.println("Multiply test = FAIL");
        }
    }

    void isEvenTest() {
        int number = 5;
        boolean expectedResult = false;

        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number);

        if (expectedResult == realResult) {
            System.out.println("Odd test = Ok");
        } else {
            System.out.println("Odd test = FAIL");
        }

        number = 10;
        expectedResult = true;
        realResult = calculator.isEven(number);
        if (expectedResult == realResult) {
            System.out.println("Even test = Ok");
        } else {
            System.out.println("Even test = FAIL");
        }
    }

    void getMaxTest() {
        int number1 = 56;
        int number2 = 34;
        int expectedResult = 56;

        Calculator calculator = new Calculator();
        int realResult = calculator.getMax(number1, number2);

        if (expectedResult == realResult) {
            System.out.println("Get max number test (a > b) = Ok");
        } else {
            System.out.println("Odd Get max number test (a > b) = FAIL");
        }

        number1 = 56;
        number2 = 145;
        expectedResult = 145;

        realResult = calculator.getMax(number1, number2);

        if (expectedResult == realResult) {
            System.out.println("Get max number test (a < b) = Ok");
        } else {
            System.out.println("Odd Get max number test (a < b) = FAIL");
        }

        number1 = 8734;
        number2 = 8734;
        expectedResult = 8734;

        realResult = calculator.getMax(number1, number2);

        if (expectedResult == realResult) {
            System.out.println("Get max number test (a = b) = Ok");
        } else {
            System.out.println("Odd Get max number test (a = b) = FAIL");
        }
    }

    void getMaxOfThreeTest() {
        int number1, number2, number3;
        int expectedResult, realResult;
        Calculator calculator = new Calculator();

        // test 1
        number1 = 987;
        number2 = 321;
        number3 = 456;
        expectedResult = 987;
        realResult = calculator.getMaxOfThree(number1, number2, number3);
        if (expectedResult == realResult){
            System.out.println("Get max numbeer of 3 number (a > b > c) = Ok");
        } else {
            System.out.println("Get max numbeer of 3 number (a > b > c) = FAIL");
        }

        // test 2
        number1 = 987;
        number2 = 1000;
        number3 = 456;
        expectedResult = 1000;
        realResult = calculator.getMaxOfThree(number1, number2, number3);
        if (expectedResult == realResult){
            System.out.println("Get max numbeer of 3 number (a < b > c) = Ok");
        } else {
            System.out.println("Get max numbeer of 3 number (a < b > c) = FAIL");
        }

        // test 3
        number1 = 987;
        number2 = 1000;
        number3 = 10456;
        expectedResult = 10456;
        realResult = calculator.getMaxOfThree(number1, number2, number3);
        if (expectedResult == realResult){
            System.out.println("Get max numbeer of 3 number (a < b < c) = Ok");
        } else {
            System.out.println("Get max numbeer of 3 number (a < b < c) = FAIL");
        }

        // test 4
        number1 = 98765;
        number2 = 98765;
        number3 = 1046;
        expectedResult = 98765;
        realResult = calculator.getMaxOfThree(number1, number2, number3);
        if (expectedResult == realResult){
            System.out.println("Get max numbeer of 3 number (a = b > c) = Ok");
        } else {
            System.out.println("Get max numbeer of 3 number (a = b > c) = FAIL");
        }

        // test 5
        number1 = 12345;
        number2 = 23456;
        number3 = 23456;
        expectedResult = 23456;
        realResult = calculator.getMaxOfThree(number1, number2, number3);
        if (expectedResult == realResult){
            System.out.println("Get max numbeer of 3 number (a < b = c) = Ok");
        } else {
            System.out.println("Get max numbeer of 3 number (a < b = c) = FAIL");
        }

        // test 5
        number1 = 1111;
        number2 = 2222;
        number3 = 1111;
        expectedResult = 2222;
        realResult = calculator.getMaxOfThree(number1, number2, number3);
        if (expectedResult == realResult){
            System.out.println("Get max numbeer of 3 number (a > b < c and a = c) = Ok");
        } else {
            System.out.println("Get max numbeer of 3 number (a > b < c and a = c) = FAIL");
        }

        // test 6
        number1 = 345;
        number2 = 345;
        number3 = 345;
        expectedResult = 345;
        realResult = calculator.getMaxOfThree(number1, number2, number3);
        if (expectedResult == realResult){
            System.out.println("Get max numbeer of 3 number (a = b = c) = Ok");
        } else {
            System.out.println("Get max numbeer of 3 number (a = b = c) = FAIL");
        }
    }

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.minusTest();
        calculatorTest.divideTest();
        calculatorTest.multiplyTest();
        calculatorTest.isEvenTest();
        calculatorTest.getMaxTest();
        calculatorTest.getMaxOfThreeTest();
    }
}
