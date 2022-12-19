package students.student_zanna_klimova.lesson_7.level5;

public class PowerCalculatorTest {
    public static void main(String[] args) {
        PowerCalculatorTest test = new PowerCalculatorTest();
        test.exponentiationTest();
    }

    void exponentiationTest() {
        PowerCalculator powerCalculator = new PowerCalculator();
        int expectedResult = 3125;
        int actualResult = powerCalculator.exponentiation(5, 5);
        if (expectedResult == actualResult) {
            System.out.println("Test is OK.");
        } else {
            System.out.println("Test Failed.");
        }
    }
}
