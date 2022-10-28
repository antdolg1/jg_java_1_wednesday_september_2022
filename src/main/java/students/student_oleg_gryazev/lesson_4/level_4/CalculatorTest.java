package students.student_oleg_gryazev.lesson_4.level_4;

public class CalculatorTest {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        calculator.sumTest();
        {
            int firstNumber = 10;  // подготавливаем тестовые данные
            int secondNumber = 5;  // подготавливаем тестовые данные
            int expectedResult = 15;  // подготавливаем тестовые данные

            int realResult = calculator.sum(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
            if (realResult == expectedResult) {
                // проверяем правильно ли сработал тестируемый код
                System.out.println("Sum test = OK");
                Calculator.isEven(15);
            } else {
                System.out.println("Sum test = FAIL");
            }

            calculator.decTest();
            {
                expectedResult = 5;
                realResult = calculator.dec(firstNumber, secondNumber);
                if (realResult == expectedResult) {
                    System.out.println("Dec test = OK");
                    Calculator.isEven(5);
                } else {
                    System.out.println("Dec test = FAIL");
                }

                calculator.divTest();
                {
                    expectedResult = 2;
                    realResult = calculator.div(firstNumber, secondNumber);
                    if (realResult == expectedResult) {
                        System.out.println("Div test = OK");
                        Calculator.isEven(2);
                    } else {
                        System.out.println("Div test = FAIL");
                    }

                    calculator.mulTest();
                    {
                        expectedResult = 50;
                        realResult = calculator.mul(firstNumber, secondNumber);
                        if (realResult == expectedResult) {
                            System.out.println("Mul test = OK");
                            Calculator.isEven(50);

                        } else {
                            System.out.println("Mul test = FAIL");
                        }
                    }
                }
                    calculator.maxTest();{
                        firstNumber = 33;
                        secondNumber = 124;
                    expectedResult = 14;

                    if (firstNumber > secondNumber && firstNumber > expectedResult) {
                        System.out.println("First");

                    } else if (secondNumber > firstNumber && secondNumber > expectedResult) {
                        System.out.println("second");
                    } else if (expectedResult > firstNumber && expectedResult > secondNumber) {
                        System.out.println("Expected");


                    }
                }
            }
        }
    }
}
