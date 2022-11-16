package students.student_artjoms_trosihins.level_4.task_14;

class CalculatorTest {

    public static void main(String[] args) {

        CalculatorTest test = new CalculatorTest();
        test.isNumberOneHigherThanNumberTwo();
        test.isNumberTwoHigherThanNumberOne();
        test.areNumberEquals();
    }

    void isNumberOneHigherThanNumberTwo() {
        Calculator victim = new Calculator();

        int numberOne = 20;
        int numberTwo = 10;
        int expectedResult = 20;

        int actualResult = victim.maxOfTwoNumbers(numberOne, numberTwo);
        if (expectedResult == actualResult) {
            System.out.println("Test isNumberOneHigherThanNumberTwo passed!");
        } else {
            System.out.println("Test failed!");
            System.out.println("Expected result " + expectedResult + " actual result " + actualResult);
        }
    }

    void isNumberTwoHigherThanNumberOne() {
        Calculator victim = new Calculator();

        int numberOne = 30;
        int numberTwo = 999;
        int expectedResult = 999;

        int actualResult = victim.maxOfTwoNumbers(numberOne, numberTwo);
        if (expectedResult == actualResult) {
            System.out.println("Test isNumberTwoHigherThanNumberOne passed");
        } else {
            System.out.println("Test isNumberTwoHigherThanNumberOne failed");
            System.out.println("Expected result " + expectedResult + " actual result " + actualResult);
        }
    }

    void areNumberEquals() {
        Calculator victim = new Calculator();

        int numberOne = 8;
        int numberTwo = 8;
        int expectedResult = 8;

        int actualResult = victim.maxOfTwoNumbers(numberOne, numberTwo);
        if (expectedResult == actualResult) {
            System.out.println("Test areNumberEquals is passed! ");
        } else {
            System.out.println("Test areNumberEquals failed");
            System.out.println("Expected result " + expectedResult + " actual result " + actualResult);
        }
    }
}