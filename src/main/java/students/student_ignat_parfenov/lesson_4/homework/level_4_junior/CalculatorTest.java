package students.student_ignat_parfenov.lesson_4.homework.level_4_junior;

public class CalculatorTest {

    public static void main(String[] args) {

        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subtractionTest();
        calculatorTest.multiplicationTest();
        calculatorTest.divisionTest();

    }

    private void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);

        if (realResult == expectedResult) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }


    private void subtractionTest() {
        int firstNumber = 10;
        int secondNumber = 5;

    }

    private void multiplicationTest() {
    }

    private void divisionTest() {
    }
}
