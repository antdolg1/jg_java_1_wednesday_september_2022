package students.student_deniss_fiscevs.lesson04.level_4_junior;

public class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subsTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTestEven();
        calculatorTest.isEvenTestNotEven();
        calculatorTest.maxOfTwoNumbersTestFirstBigger();
        calculatorTest.maxOfTwoNumbersTestSecondBigger();
        calculatorTest.maxOfTwoNumbersTestEven();
        calculatorTest.maxOfThreeNumbersTestFirstBigger();
        calculatorTest.maxOfThreeNumbersTestSecondBigger();
        calculatorTest.maxOfThreeNumbersTestThirdBigger();
        calculatorTest.maxOfThreeNumbersTestFirstAndSecondBigger();
        calculatorTest.maxOfThreeNumbersTestFirstAndThirdBigger();
        calculatorTest.maxOfThreeNumbersTestSecondAndThirdBigger();
        calculatorTest.maxOfThreeNumbersTestEven();
    }

    public void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 15;

        Calculator victim = new Calculator();
        int realResult = victim.sum(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void subsTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;

        Calculator victim = new Calculator();
        int realResult = victim.subs(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Subtraction test = OK");
        } else {
            System.out.println("Subtraction test = FAIL");
        }
    }

    public void mulTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 50;

        Calculator victim = new Calculator();
        int realResult = victim.mul(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Multiply test = OK");
        } else {
            System.out.println("Multiply test = FAIL");
        }
    }

    public void divTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 2;

        Calculator victim = new Calculator();
        int realResult = victim.div(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Division test = OK");
        } else {
            System.out.println("Division test = FAIL");
        }
    }

    public void isEvenTestEven() {
        int firstNumber = 10;
        boolean expectedResult = true;

        Calculator victim = new Calculator();
        boolean realResult = victim.isEven(firstNumber);
        if (realResult == expectedResult) {
            System.out.println("Is even test = OK");
        } else {
            System.out.println("Is even test = FAIL");
        }
    }

    public void isEvenTestNotEven() {
        int firstNumber = 9;
        boolean expectedResult = false;

        Calculator victim = new Calculator();
        boolean realResult = victim.isEven(firstNumber);
        if (realResult == expectedResult) {
            System.out.println("Not even test = OK");
        } else {
            System.out.println("Not even test = FAIL");
        }
    }

    public void maxOfTwoNumbersTestFirstBigger() {
        int firstNumber = 5;
        int secondNumber = 2;
        int expectedResult = 5;

        Calculator victim = new Calculator();
        int realResult = victim.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Max of two test = OK");
        } else {
            System.out.println("Max of two test = FAIL");
        }
    }

    public void maxOfTwoNumbersTestSecondBigger() {
        int firstNumber = 3;
        int secondNumber = 6;
        int expectedResult = 6;

        Calculator victim = new Calculator();
        int realResult = victim.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Max of two test = OK");
        } else {
            System.out.println("Max of two test = FAIL");
        }
    }

    public void maxOfTwoNumbersTestEven() {
        int firstNumber = 3;
        int secondNumber = 3;
        int expectedResult = 3;

        Calculator victim = new Calculator();
        int realResult = victim.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Max of two test = OK");
        } else {
            System.out.println("Max of two test = FAIL");
        }
    }

    public void maxOfThreeNumbersTestFirstBigger() {
        int firstNumber = 10;
        int secondNumber = 5;
        int thirdNumber = 2;
        int expectedResult = 10;

        Calculator victim = new Calculator();
        int realResult = victim.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Max of three test = OK");
        } else {
            System.out.println("Max of three test = FAIL");
        }
    }

    public void maxOfThreeNumbersTestSecondBigger() {
        int firstNumber = 4;
        int secondNumber = 5;
        int thirdNumber = 2;
        int expectedResult = 5;

        Calculator victim = new Calculator();
        int realResult = victim.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Third max of three test = OK");
        } else {
            System.out.println("Third max of three test = FAIL");
        }
    }

    public void maxOfThreeNumbersTestThirdBigger() {
        int firstNumber = 2;
        int secondNumber = 5;
        int thirdNumber = 7;
        int expectedResult = 7;

        Calculator victim = new Calculator();
        int realResult = victim.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Max of three test = OK");
        } else {
            System.out.println("Max of three test = FAIL");
        }
    }

    public void maxOfThreeNumbersTestFirstAndSecondBigger() {
        int firstNumber = 5;
        int secondNumber = 5;
        int thirdNumber = 3;
        int expectedResult = 5;

        Calculator victim = new Calculator();
        int realResult = victim.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
        System.out.println("First and Second even and bigger test = OK");
        } else {
        System.out.println("First and Second even and bigger test = FAIL");
        }
    }

    public void maxOfThreeNumbersTestFirstAndThirdBigger() {
        int firstNumber = 10;
        int secondNumber = 3;
        int thirdNumber = 10;
        int expectedResult = 10;

        Calculator victim = new Calculator();
        int realResult = victim.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("First and Third even and bigger test = OK");
        } else {
            System.out.println("First and Third even and bigger test = FAIL");
        }
    }

    public void maxOfThreeNumbersTestSecondAndThirdBigger() {
        int firstNumber = 50;
        int secondNumber = 298;
        int thirdNumber = 298;
        int expectedResult = 298;

        Calculator victim = new Calculator();
        int realResult = victim.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Second and Third bigger test = OK");
        } else {
            System.out.println("Second and Third bigger test = FAIL");
        }
    }

        public void maxOfThreeNumbersTestEven() {
        int firstNumber = 10;
        int secondNumber = 10;
        int thirdNumber = 10;
        int expectedResult = 10;

        Calculator victim = new Calculator();
        int realResult = victim.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("All even = OK");
        } else {
            System.out.println("All even = FAIL");
        }
    }

}
