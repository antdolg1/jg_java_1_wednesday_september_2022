package students.student_vladislav_saksin.lesson_4.homework.level_4.task_14;

class CalculatorTest {

    public static void main(String[] args) {

        CalculatorTest test = new CalculatorTest();
        test.aIsGreaterThanB();
        test.bIsGreaterThanA();
        test.numbersAreEqual();
    }

    void aIsGreaterThanB() {

        Calculator victim = new Calculator();

        int a = 100;
        int b = 20;
        int expectedResult = 100;

        int actualResult = victim.maxOfTwoNumbers(a, b);

        if (expectedResult == actualResult) {

            System.out.println("Test A > B = OK");
        } else System.out.println("Test A > B = FAIL");
    }

    void bIsGreaterThanA() {

        Calculator victim = new Calculator();

        int a = 200;
        int b = 300;
        int expectedResult = 300;

        int actualResult = victim.maxOfTwoNumbers(a, b);

        if (expectedResult == actualResult) {

            System.out.println("Test B > A = OK");
        } else System.out.println("Test B > A = FAIL");

    }

    void numbersAreEqual() {

        Calculator victim = new Calculator();

        int a = 300;
        int b = 300;
        int expectedResult = 300;

        int actualResult = victim.maxOfTwoNumbers(a, b);

        if (expectedResult == actualResult) {

            System.out.println("Test numbers are equal = OK");
        } else System.out.println("Test numbers are equal = FAIL");


    }

}
