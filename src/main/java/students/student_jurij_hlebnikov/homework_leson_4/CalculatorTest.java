package students.student_jurij_hlebnikov.homework_leson_4;

public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subtractionTest();
        calculatorTest.divisionTest();
        calculatorTest.multiplicationTest();
        calculatorTest.isOddTest();
        // по аналогии реализуйте тесты для остальных методов
    }

    public void sumTest() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int expectedResult = 15;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }
    public void subtractionTest(){
        int firstNumber = 20;
        int secondNumber = 5;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.subtraction(firstNumber,secondNumber);
        if(realResult == expectedResult){
            System.out.println("Subtraction test = OK");
        }else {
            System.out.println("Subtraction test = FAIL");
        }
    }
    public void divisionTest(){
        int firstNumber = 50;
        int secondNumber = 5;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.division(firstNumber,secondNumber);
        if(realResult == expectedResult){
            System.out.println("Division test = OK");
        }else {
            System.out.println("Division test = FAIL");
        }
    }
    public void multiplicationTest(){
        int firstNumber = 2;
        int secondNumber = 10;
        int expectedResult = 20;
        Calculator calculator = new Calculator();
        int realResult = calculator.multiplication(firstNumber,secondNumber);
        if(realResult == expectedResult){
            System.out.println("Multiplication test = OK");
        }else {
            System.out.println("Multiplication test = FAIL");
        }
    }
    public void isOddTest(){
        int number = 3;
        Calculator calculator = new Calculator();
        boolean even = calculator.isEven(number);
        if (!even){
            System.out.println("OddNumberTest = OK");
        }else {
            System.out.println("OddNumberTest = FAIL");
        }
    }
    public void isEvenTest(){
        int number = 4;
        Calculator calculator = new Calculator();
        boolean even = calculator.isEven(number);
        if (even){
            System.out.println("EvenNumberTest = OK");
        }else {
            System.out.println("EvenNumberTest = OK");
        }
    }

}
