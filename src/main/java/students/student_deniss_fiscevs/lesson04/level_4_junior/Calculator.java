package students.student_deniss_fiscevs.lesson04.level_4_junior;

public class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int subs(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int mul(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int div(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public boolean isEven(int number) {
        boolean result = true;
        if (number % 2 == 0) {
            return result;
        } else {
            return false;
        }
    }

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber;
        } else if (secondNumber > firstNumber) {
            return secondNumber;
        } else {
            return firstNumber;
        }
    }

    public int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber == secondNumber && firstNumber < thirdNumber) {
            return thirdNumber;
        } else if (firstNumber == secondNumber && firstNumber > thirdNumber) {
            return firstNumber;
        } else if (secondNumber == thirdNumber && secondNumber < firstNumber) {
            return firstNumber;
        } else if (secondNumber == thirdNumber && secondNumber > firstNumber) {
            return secondNumber;
        } else if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            return firstNumber;
        } else if (secondNumber > thirdNumber) {
            return secondNumber;
        } else if (thirdNumber > firstNumber) {
            return thirdNumber;
        } else {
            return firstNumber;
        }
    }
}
