package students.student_konstantin_karetnikov.lesson_4.level_4;

class Calculator {
    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int sub(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int mlt(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int div(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public int GreaterOfTwoNumbers(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) return firstNumber;
        else {
            return secondNumber;
        }
    }

    public int GreaterOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber > secondNumber && firstNumber > thirdNumber) return firstNumber;
        else if (secondNumber > firstNumber && secondNumber > thirdNumber) return secondNumber;
        else if (thirdNumber > firstNumber && thirdNumber > secondNumber) return thirdNumber;
        else {
            return firstNumber = secondNumber = thirdNumber;
        }

    }
}