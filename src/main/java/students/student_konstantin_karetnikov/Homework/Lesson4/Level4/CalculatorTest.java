package students.student_konstantin_karetnikov.Homework.Lesson4.Level4;

public class CalculatorTest {
    public static void main(String[] args) {

        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mltTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest();
        calculatorTest.GreaterOfTwoNumbersFirst();
        calculatorTest.GreaterOfTwoNumbersSecond();
        calculatorTest.GreaterOfTwoNumbersEqual();
        calculatorTest.GreaterOfThreeNumbersFirst();
        calculatorTest.GreaterOfThreeNumbersSecond();
        calculatorTest.GreaterOfThreeNumbersThird();
        calculatorTest.TwoEqualGreaterThenThird();
        calculatorTest.TwoEqualGreaterThenSecond();
        calculatorTest.TwoEqualGreaterThenFirst();
        calculatorTest.ThreeEqual();
    }

    void sumTest() {
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

    void subTest() {
        int firstNumber = 20;
        int secondNumber = 17;
        int expectedResult = 3;
        Calculator calculator = new Calculator();
        int realResult = calculator.sub(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sub test = OK");
        } else {
            System.out.println("Sub test = FAIL");
        }


    }

    void mltTest() {
        int firstNumber = 11;
        int secondNumber = 6;
        int expectedResult = 66;
        Calculator calculator = new Calculator();
        int realResult = calculator.mlt(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Mlt test = OK");
        } else {
            System.out.println("Mlt test = FAIL");
        }


    }

    void divTest() {
        int firstNumber = 555;
        int secondNumber = 111;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.div(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Div test = OK");
        } else {
            System.out.println("Div test = FAIL");
        }
    }

    void isEvenTest() {
        int number = 10;
        boolean result = true;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number);
        if (realResult == result) {
            System.out.println("isEven test = OK");
        } else {
            System.out.println("isEven test = FAIL");
        }
    }

    void GreaterOfTwoNumbersFirst() {
        int firstNumber = 555;
        int secondNumber = 111;
        int expectedResult = 555;
        Calculator calculator = new Calculator();
        int realResult = calculator.GreaterOfTwoNumbers(firstNumber,
                secondNumber);
        if (realResult == expectedResult) {
            System.out.println("GreaterOfTwoNumbersFirst test = OK");
        } else {
            System.out.println("GreaterOfTwoNumbersFirst test = FAIL");
        }
    }

    void GreaterOfTwoNumbersSecond() {
        int firstNumber = 34;
        int secondNumber = 55;
        int expectedResult = 55;
        Calculator calculator = new Calculator();
        int realResult = calculator.GreaterOfTwoNumbers(firstNumber,
                secondNumber);
        if (realResult == expectedResult) {
            System.out.println("GreaterOfTwoNumbersSecond test = OK");
        } else {
            System.out.println("GreaterOfTwoNumbersSecond test = FAIL");
        }
    }

    void GreaterOfTwoNumbersEqual() {
        int firstNumber = 44;
        int secondNumber = 44;
        int expectedResult = 44;
        Calculator calculator = new Calculator();
        int realResult = calculator.GreaterOfTwoNumbers(firstNumber,
                secondNumber);
        if (realResult == expectedResult) {
            System.out.println("GreaterOfTwoNumbersEqual test = OK");
        } else {
            System.out.println("GreaterOfTwoNumbersEqual test = FAIL");
        }
    }
    void GreaterOfThreeNumbersFirst() {
        int firstNumber = 555;
        int secondNumber = 111;
        int thirdNumber = 5;
        int expectedResult = 555;
        Calculator calculator = new Calculator();
        int realResult = calculator.GreaterOfThreeNumbers(firstNumber,
                secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("GreaterOfThreeNumbersFirst test = OK");
        } else {
            System.out.println("GreaterOfThreeNumbersFirst test = FAIL");
        }
    }

    void GreaterOfThreeNumbersSecond() {
        int firstNumber = 555;
        int secondNumber = 1111;
        int thirdNumber = 5;
        int expectedResult = 1111;
        Calculator calculator = new Calculator();
        int realResult = calculator.GreaterOfThreeNumbers(firstNumber,
                secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("GreaterOfThreeNumbersSecond test = OK");
        } else {
            System.out.println("GreaterOfThreeNumbersSecond test = FAIL");
        }
    }

    void GreaterOfThreeNumbersThird() {
        int firstNumber = 555;
        int secondNumber = 1111;
        int thirdNumber = 14000;
        int expectedResult = 14000;
        Calculator calculator = new Calculator();
        int realResult = calculator.GreaterOfThreeNumbers(firstNumber,
                secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("GreaterOfThreeNumbersThird test = OK");
        } else {
            System.out.println("GreaterOfThreeNumbersThird test = FAIL");
        }
    }

    void TwoEqualGreaterThenThird() {
        int firstNumber = 5000;
        int secondNumber = 5000;
        int thirdNumber = 14;
        int expectedResult = 5000;
        Calculator calculator = new Calculator();
        int realResult = calculator.GreaterOfThreeNumbers(firstNumber,
                secondNumber, thirdNumber);
        // не понимаю почему этот тест FAIL???!!
        if (realResult == expectedResult) {
            System.out.println("TwoEqualGreaterThenThird test = OK");
        } else {
            System.out.println("TwoEqualGreaterThenThird test = FAIL");
        }
    }

    void TwoEqualGreaterThenSecond() {
        int firstNumber = 5000;
        int secondNumber = 14;
        int thirdNumber = 5000;
        int expectedResult = 5000;
        Calculator calculator = new Calculator();
        int realResult = calculator.GreaterOfThreeNumbers(firstNumber,
                secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("TwoEqualGreaterThenSecond test = OK");
        } else {
            System.out.println("TwoEqualGreaterThenSecond test = FAIL");
        }
    }

    void TwoEqualGreaterThenFirst() {
        int firstNumber = 14;
        int secondNumber = 5000;
        int thirdNumber = 5000;
        int expectedResult = 5000;
        Calculator calculator = new Calculator();
        int realResult = calculator.GreaterOfThreeNumbers(firstNumber,
                secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("TwoEqualGreaterThenFirst test = OK");
        } else {
            System.out.println("TwoEqualGreaterThenFirst test = FAIL");
        }
    }

    void ThreeEqual() {
        int firstNumber = 5000;
        int secondNumber = 5000;
        int thirdNumber = 5000;
        int expectedResult = 5000;
        Calculator calculator = new Calculator();
        int realResult = calculator.GreaterOfThreeNumbers(firstNumber,
                secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("ThreeEqual test = OK");
        } else {
            System.out.println("ThreeEqual test = FAIL");
        }
    }
}
