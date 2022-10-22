package students.student_ilja_morozovs.lesson_4.homework.level_4.Task_13;

class Calculator {
    int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    int subtraction(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    int increase(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    int division(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    boolean isEven(int number) {
        boolean boolResult = false;
        int divisionResult = number % 2;
        if (divisionResult == 0) {
            boolResult = true;
        }
        return boolResult;
    }
}
