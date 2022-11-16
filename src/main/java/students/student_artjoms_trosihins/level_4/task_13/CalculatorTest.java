package students.student_artjoms_trosihins.level_4.task_13;

class CalculatorTest {
    public static void main(String[] args) {

        CalculatorTest test = new CalculatorTest();
        test.isEvenTest();
    }

    public void isEvenTest() {
        Calculator victim = new Calculator();

        int number = 21;
        boolean expectedResult = true;

        boolean actualResult = victim.isEven(number);

        if (expectedResult == actualResult) {
            System.out.println("Test isEvenTest passed");
        } else {
            System.out.println("Test failed!");
            System.out.println("Expected result " + expectedResult + " actual result " + actualResult);
        }
    }
}


