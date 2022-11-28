package students.student_oskars_popens.lesson_7.level_5_middle;

class PowerCalculatorTest {
    public static void main(String[] args) {
        PowerCalculatorTest test = new PowerCalculatorTest();
        test.testNumberToPower();
    }

    private void testNumberToPower() {
        PowerCalculator powerCalculator = new PowerCalculator();
        int number = 5;
        int power = 4;
        int expectedResult = 625;
        checkTestResult(powerCalculator.numberToPower(number, power) == expectedResult, "Number To power:");
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}
