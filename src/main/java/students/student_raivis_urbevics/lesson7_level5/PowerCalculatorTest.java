package students.student_raivis_urbevics.lesson7_level5;

class PowerCalculatorTest {

    public static void main(String[] args) {
        PowerCalculatorTest powerCalculatorTest = new PowerCalculatorTest();
        powerCalculatorTest.raisingNumberTest();

    }

    void raisingNumberTest() {
        PowerCalculator powerCalculator = new PowerCalculator();
        int expectedResult = 25;
        int realResult = powerCalculator.raisingNumber(5, 2);
        if (realResult == expectedResult) {
            System.out.println("Raising Number Test = OK");
        } else {
            System.out.println("Raising Number Test = FAIL");
        }
    }
}
