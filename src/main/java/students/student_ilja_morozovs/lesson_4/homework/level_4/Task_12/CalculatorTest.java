package students.student_ilja_morozovs.lesson_4.homework.level_4.Task_12;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subtractionTest();
        calculatorTest.increaseTest();
        calculatorTest.divisionTest();
    }

    void sumTest() {
        int numberOne = 10;
        int numberTwo = 5;
        int result = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(numberOne, numberTwo);
        if (realResult == result) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    void subtractionTest() {
        int numberOne = 10;
        int numberTwo = 5;
        int result = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.subtraction(numberOne, numberTwo);
        if (realResult == result) {
            System.out.println("Sub test = OK");
        } else {
            System.out.println("Sub test = FAIL");
        }
    }

    void increaseTest() {
        int numberOne = 10;
        int numberTwo = 5;
        int result = 50;
        Calculator calculator = new Calculator();
        int realResult = calculator.increase(numberOne, numberTwo);
        if (realResult == result) {
            System.out.println("Inc test = OK");
        } else {
            System.out.println("Inc test = FAIL");
        }
    }

    void divisionTest() {
        int numberOne = 10;
        int numberTwo = 5;
        int result = 2;
        Calculator calculator = new Calculator();
        int realResult = calculator.division(numberOne, numberTwo);
        if (realResult == result) {
            System.out.println("Dec test = OK");
        } else {
            System.out.println("Dec test = FAIL");
        }
    }
}
