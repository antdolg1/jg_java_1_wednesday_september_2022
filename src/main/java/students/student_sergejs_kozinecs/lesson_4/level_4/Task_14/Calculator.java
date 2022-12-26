package students.student_sergejs_kozinecs.lesson_4.level_4.Task_14;

class Calculator {
    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int divide(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public boolean isEven(int number) {
        return number % 2 == 0 ? true : false;
    }

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        return firstNumber > secondNumber ? firstNumber : secondNumber;
    }
}
