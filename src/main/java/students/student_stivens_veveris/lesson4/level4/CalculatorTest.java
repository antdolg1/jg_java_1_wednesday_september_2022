package students.student_stivens_veveris.lesson4.level4;

class CalculatorTest {

    public static void main(String[] args) {

        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest();
        calculatorTest.maxOfTwoNumbersTest();
        calculatorTest.maxOfTwoNumbersTest2();
        calculatorTest.maxOfTwoNumbersTest3();
        calculatorTest.maxOfThreeNumbersTest();
        calculatorTest.maxOfThreeNumbersTest2();
        calculatorTest.maxOfThreeNumbersTest3();
        calculatorTest.maxOfThreeNumbersTest4();
        calculatorTest.maxOfThreeNumbersTest5();
    }

        public void sumTest () {
            int firstNumber = 10;
            int secondNumber = 5;
            int expectedResult = 15;
            Calculator calculator = new Calculator();
            int realResult = calculator.sum(firstNumber, secondNumber);
            if (realResult == expectedResult) {
                System.out.println("Sum test = OK");
            } else {
                System.out.println("Sum test = FAIL");
            }
        }

         public void subTest() {
             int firstNumber = 67;
             int secondNumber = 14;
             int expectedResult = 53;
             Calculator calculator = new Calculator();
             int realResult = calculator.sub(firstNumber, secondNumber);
             if (realResult == expectedResult) {
                 System.out.println("Sub test = OK");
             } else {
                 System.out.println("Sub test = FAIL");
             }
         }

    public void mulTest() {
        int firstNumber = 5;
        int secondNumber = 8;
        int expectedResult = 40;
        Calculator calculator = new Calculator();
        int realResult = calculator.mul(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Mul test = OK");
        } else {
            System.out.println("Mul test = FAIL");
        }
    }

    public void divTest() {
        int firstNumber = 100;
        int secondNumber = 25;
        int expectedResult = 4;
        Calculator calculator = new Calculator();
        int realResult = calculator.div(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Div test = OK");
        } else {
            System.out.println("Div test = FAIL");
        }
    }

    public void isEvenTest() {
        int number = 100;
        boolean result = true;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number);
        if (realResult == result) {
            System.out.println("isEven test = OK");
        } else {
            System.out.println("isEven test = FAIL");
        }
    }

    public void maxOfTwoNumbersTest() {
        int firstNumber = 103;
        int secondNumber = 40;
        int expectedResult = 103;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
            if (realResult == expectedResult) {
            System.out.println("maxOfTwoNumbersTest test = OK");
        } else {
            System.out.println("maxOfTwoNumbersTest test = FAIL");
        }
    }

    public void maxOfTwoNumbersTest2() {
        int firstNumber = 2;
        int secondNumber = 50;
        int expectedResult = 50;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfTwoNumbersTest2 test = OK");
        } else {
            System.out.println("maxOfTwoNumbersTest2 test = FAIL");
        }
    }

    public void maxOfTwoNumbersTest3() {
        int firstNumber = 50;
        int secondNumber = 50;
        int expectedResult = 50;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfTwoNumbersTest3 test = OK");
        } else {
            System.out.println("maxOfTwoNumbersTest3 test = FAIL");
        }
    }

    public void maxOfThreeNumbersTest() {
        int firstNumber = 50;
        int secondNumber = 44;
        int thirdNumber = 2;
        int expectedResult = 50;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfThreeNumbers test = OK");
        } else {
            System.out.println("maxOfThreeNumbers  test = FAIL");
        }
    }

    public void maxOfThreeNumbersTest2() {
        int firstNumber = 44;
        int secondNumber = 50;
        int thirdNumber = 2;
        int expectedResult = 50;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfThreeNumbers2 test = OK");
        } else {
            System.out.println("maxOfThreeNumbers2  test = FAIL");
        }
    }

    public void maxOfThreeNumbersTest3() {
        int firstNumber = 2;
        int secondNumber = 44;
        int thirdNumber = 50;
        int expectedResult = 50;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfThreeNumbers3 test = OK");
        } else {
            System.out.println("maxOfThreeNumbers3  test = FAIL");
        }
    }

    public void maxOfThreeNumbersTest4() {
        int firstNumber = 50;
        int secondNumber = 50;
        int thirdNumber = 44;
        int expectedResult = 50;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfThreeNumbers4 test = OK");
        } else {
            System.out.println("maxOfThreeNumbers4 test = FAIL");
        }
    }

    public void maxOfThreeNumbersTest5() {
        int firstNumber = 33;
        int secondNumber = 33;
        int thirdNumber = 33;
        int expectedResult = 33;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfThreeNumbers5 test = OK");
        } else {
            System.out.println("maxOfThreeNumbers5  test = FAIL");
        }
    }
}

