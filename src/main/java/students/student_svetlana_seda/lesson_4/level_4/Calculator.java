package students.student_svetlana_seda.lesson_4.level_4;

class Calculator {
    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int multiplication(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int subtruction(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int division(int firstNumber, int secondNumber) {

        return firstNumber / secondNumber;
    }

    public boolean isEven(int number) {
        boolean result = true;
        if (number % 2 == 0) {
            return result;
        }

    }

    public int maxNumberOfTwoNumbers(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber;
        } else if (secondNumber > firstNumber) {
            return secondNumber;
        } else {
            return firstNumber;
        }

    }

    public int biggestOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
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

    public int firstNumberTheBiggest(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            return firstNumber;
        }

    }

    public int secondNumberTheBiggest(int firstNumber, int secondNumber, int thirdNumber) {
        if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            return secondNumber;
        }

    }

    public int thirdNumberTheBiggest(int firstNumber, int secondNumber, int thirdNumber) {
        if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
            return thirdNumber;
        }

    }

    public int firstAndSecondEqualBiggest(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber == secondNumber && firstNumber > thirdNumber) {
            return firstNumber;
        }

    }

    public int allEquals(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber == secondNumber && secondNumber == thirdNumber) {
            return firstNumber;
        }

    }

}
