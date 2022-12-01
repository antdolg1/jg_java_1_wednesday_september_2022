package students.student_ilja_morozovs.lesson_7.level_5.Task_9;

public class PowerCalculatorTest {
    public static void main(String[] args) {
        PowerCalculatorTest powerCalculatorTest = new PowerCalculatorTest();
        powerCalculatorTest.condition(powerCalculatorTest.exponentiationTest());
    }

    boolean exponentiationTest() {
        boolean condition = false;
        double targetResult = 8;
        PowerCalculator powerCalculator = new PowerCalculator();
        double realResult = powerCalculator.exponentiation(2, 3);
        if (targetResult == realResult) {
            condition = true;
        }
        return condition;
    }

    void condition(boolean condition) {
        if (condition) {
            System.out.println("Test is: OK!!!");
        } else {
            System.out.println("Test is: FAIL!!!");
        }
    }
}
