package students.student_svetlana_seda.lesson_7.homework.level_5;

class PowerCalculatorTest {

    public static void main(String[] args) {
        PowerCalculatorTest PowerCalculatorTest = new PowerCalculatorTest();
        PowerCalculatorTest.powerNumberTest();
    }

    private void powerNumberTest() {
        PowerCalculator powerCalculator = new PowerCalculator();
        int number = 2;
        int degree = 2;
        int expectedResult = 4;
        checkTestResult(powerCalculator.powerNumber(number, degree) == expectedResult, "Test is ");
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " OK!");
        } else {
            System.out.println(testName + " FAIL!");
        }
    }

}
