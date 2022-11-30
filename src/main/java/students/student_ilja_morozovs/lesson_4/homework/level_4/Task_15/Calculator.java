package students.student_ilja_morozovs.lesson_4.homework.level_4.Task_15;

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

    int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        int maxNumber = 0;
        if (firstNumber > secondNumber) {
            maxNumber = firstNumber;//первое число больше второго
        } else if (secondNumber > firstNumber) {
            maxNumber = secondNumber;//второе число больше первого
        } else {
            maxNumber = firstNumber;//оба числа равны
        }
        return maxNumber;
    }

    int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        int maxNumber = 0;
        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) { //     15|2|3
            maxNumber = firstNumber;
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {//    2|15|3
            maxNumber = secondNumber;
        } else if (thirdNumber >= firstNumber && thirdNumber >= secondNumber) {   //     3|2|15
            maxNumber = thirdNumber;
        }
        return maxNumber;
    }
}
