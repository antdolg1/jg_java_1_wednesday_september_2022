package students.student_vladislav_saksin.lesson_4.homework.level_4.task_13;

class CalculatorTest {

    public static void main(String[] args) {

        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.isEvenTest();
    }

    public void isEvenTest() {

        int number = 10;

        Calculator calculator = new Calculator();
        if (calculator.isEven(number))

        {
            System.out.println("The number is even = OK");
        } else{
            System.out.println("The number is even = FAIL");

        }
    }
}

