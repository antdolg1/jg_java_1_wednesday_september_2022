package students.student_artjoms_trosihins.lesson_4.level_4.task_15;

class CalculatorTest {
    public static void main(String[] args) {

        CalculatorTest test = new CalculatorTest();

        test.isNumberOneTheHighest();
        test.isNumberTwoTheHighest();
        test.isNumberThreeTheHighest();
        test.twoNumberEqualsAndHigherThanThirdNumber();
        test.allNumbersAreEqual();
    }

    void isNumberOneTheHighest() {
        Calculator victim = new Calculator();

        int numberOne = 30;
        int numberTwo = 2;
        int numberThree = 10;
        int expectedResult = 30;

        int actualResult = victim.maxOfThreeNumbers(numberOne, numberTwo, numberThree);

        if (expectedResult == actualResult) {
            System.out.println("Test isNumberOneTheHighest passed!");
        } else {
            System.out.println("Test isNumberOneTheHighest failed!");
            System.out.println("Expected result " + expectedResult + " actual result " + actualResult);
        }
    }

    void isNumberTwoTheHighest() {
        Calculator victim = new Calculator();

        int numberOne = 30;
        int numberTwo = 200;
        int numberThree = 10;
        int expectedResult = 200;

        int actualResult = victim.maxOfThreeNumbers(numberOne, numberTwo, numberThree);

        if (expectedResult == actualResult) {
            System.out.println("Test isNumberTwoTheHighest passed!");
        } else {
            System.out.println("Test isNumberTwoTheHighest failed!");
            System.out.println("Expected result " + expectedResult + " actual result " + actualResult);
        }
    }

    void isNumberThreeTheHighest() {
        Calculator victim = new Calculator();

        int numberOne = 30;
        int numberTwo = 2;
        int numberThree = 100;
        int expectedResult = 100;

        int actualResult = victim.maxOfThreeNumbers(numberOne, numberTwo, numberThree);

        if (expectedResult == actualResult) {
            System.out.println("Test isNumberThreeTheHighest passed!");
        } else {
            System.out.println("Test isNumberThreeTheHighest failed!");
            System.out.println("Expected result " + expectedResult + " actual result " + actualResult);
        }
    }

    void twoNumberEqualsAndHigherThanThirdNumber() {
        Calculator victim = new Calculator();

        int numberOne = 20;
        int numberTwo = 20;
        int numberThree = 10;
        int expectedResult = 20;

        int actualResult = victim.maxOfThreeNumbers(numberOne, numberTwo, numberThree);

        if (expectedResult == actualResult) {
            System.out.println("Test twoNumberEqualsAndHigherThanThirdNumber passed!");
        } else {
            System.out.println("Test twoNumberEqualsAndHigherThanThirdNumber failed!");
            System.out.println("Expected result " + expectedResult + " actual result " + actualResult);
        }
    }

    void allNumbersAreEqual() {
        Calculator victim = new Calculator();
        int numberOne = 10;
        int numberTwo = 10;
        int numberThree = 10;
        int expectedResult = 10;

        int actualResult = victim.maxOfThreeNumbers(numberOne, numberTwo, numberThree);

        if (expectedResult == actualResult) {
            System.out.println("Test allNumbersAreEqual is passed! ");
        } else {
            System.out.println("Test allNumbersAreEqual failed!");
            System.out.println("Expected result " + expectedResult + " actual result " + actualResult);
        }
    }
}
