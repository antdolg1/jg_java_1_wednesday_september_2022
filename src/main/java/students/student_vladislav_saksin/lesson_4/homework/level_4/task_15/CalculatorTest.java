package students.student_vladislav_saksin.lesson_4.homework.level_4.task_15;

class CalculatorTest {

    public static void main(String[] args) {

        CalculatorTest test = new CalculatorTest();
        test.aIsGreatest();
        test.bIsGreatest();
        test.cIsGreatest();
    }

    void aIsGreatest() {

        Calculator victim = new Calculator();

        int a = 120;
        int b = 100;
        int c = 5;
        int expectedResult = 120;

        int actualResult = victim.maxOfThreeNumbers(a, b, c);

        if (expectedResult == actualResult) {

            System.out.println("Test A is greatest = OK");
        } else System.out.println("Test A is greatest = FAIL");
    }

    void bIsGreatest() {

        Calculator victim = new Calculator();

        int a = 100;
        int b = 2500;
        int c = 5;
        int expectedResult = 2500;

        int actualResult = victim.maxOfThreeNumbers(a, b, c);

        if (expectedResult == actualResult) {

            System.out.println("Test B is greatest = OK");
        } else System.out.println("Test B is greatest = FAIL");
    }

    void cIsGreatest() {

        Calculator victim = new Calculator();

        int a = 100;
        int b = 100;
        int c = 500;
        int expectedResult = 500;

        int actualResult = victim.maxOfThreeNumbers(a, b, c);

        if (expectedResult == actualResult) {

            System.out.println("Test C is greatest = OK");
        } else System.out.println("Test C is greatest = FAIL");
    }

}
