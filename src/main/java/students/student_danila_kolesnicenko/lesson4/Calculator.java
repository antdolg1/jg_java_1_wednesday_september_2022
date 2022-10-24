package students.student_danila_kolesnicenko.lesson4;

class Calculator {


    public int sum(int firstNumber, int secondNumber) {

        return firstNumber + secondNumber;
    }

    public int sub(int firstNumber, int secondNumber) {

        return firstNumber - secondNumber;

    }

    public int div(int firstNumber, int secondNumber) {

        return firstNumber / secondNumber;

    }

    public int mul(int firstNumber, int secondNumber) {

        return firstNumber * secondNumber;

    }

    public boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public int MaxOfTwoNumbers(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return (firstNumber);
        } else {
            return (secondNumber);
        }


    }
    public int MaxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber){
        if (firstNumber > secondNumber && firstNumber > thirdNumber){
            return (firstNumber);
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            return secondNumber;
        }
        else {
            return (thirdNumber);
        }
    }
}

