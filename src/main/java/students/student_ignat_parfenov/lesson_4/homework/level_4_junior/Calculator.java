package students.student_ignat_parfenov.lesson_4.homework.level_4_junior;

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
        } else {
            return false;
        }
    }

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber;
        } else {
            return secondNumber;
        }
    }

    public int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        int maxFirstTwoNumbers = maxOfTwoNumbers(firstNumber, secondNumber);
        return maxOfTwoNumbers(maxFirstTwoNumbers, thirdNumber);
    }


    public boolean allThreeNumbersAreEqual(double firstNumber, double secondNumber, double thirdNumber) {
        if ((firstNumber == secondNumber) && (secondNumber == thirdNumber)) {
            return true;
        } else {
            return false;
        }
    }
}

