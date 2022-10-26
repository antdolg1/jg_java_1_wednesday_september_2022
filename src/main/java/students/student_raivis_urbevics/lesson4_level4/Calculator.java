package students.student_raivis_urbevics.lesson4_level4;

public class Calculator {


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
        if (number % 2 == 0) {
            return true;
        } else return false;
    }

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber)
            return firstNumber;

        else if (secondNumber > firstNumber) {
            return secondNumber;
        }
        return firstNumber;
    }


    public int maxOfThreeNumbers(int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) {
            return  num1;
        } else if (num2 > num1 && num2 > num3) {
            return  num2;
        } else if (num3 > num1 && num3 > num2) {
        }
        return  num3;
    }
}








































































