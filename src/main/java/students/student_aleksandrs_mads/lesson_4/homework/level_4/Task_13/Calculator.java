package students.student_aleksandrs_mads.lesson_4.homework.level_4.Task_13;


class Calculator {
    public int sum(int firstNumber, int secondNumber) {

        return firstNumber + secondNumber;
    }

    public int subtraction(int firstNumber, int secondNumber) {

        return firstNumber - secondNumber;
    }

    public int multiplication(int firstNumber, int secondNumber) {

        return firstNumber * secondNumber;
    }

    public int division(int firstNumber, int secondNumber) {

        return firstNumber / secondNumber;
    }
    public boolean isEven(int number) {
        int division = number % 2;
        boolean isEven1 = true;
        if (division == 0) {
            return isEven1;
        } else {
            return !isEven1;
        }
    }
}


