package students.student_svetlana_seda.lesson_4.level_4;

public class Calculator {

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

        if (number % 2 == 0) {
            return true;
        }
//непонятно, как правильно будет??? почему true ОРАНЖЕВОГО СВЕТА?
    }

    public int maxNumberOfTwoNumbers(int firstNumber, int secondNumber) {
        return firstNumber > secondNumber;

        //the same
        return secondNumber > firstNumber;
        return firstNumber == secondNumber;

    }

    public int biggestOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        int maxNumber;
        return maxNumber;

    }

    public int firstNumberTheBiggest(int firstNumber, int secondNumber, int thirdNumber) {
        return firstNumber;

    }

    public int secondNumberTheBiggest(int firstNumber, int secondNumber, int thirdNumber) {
        return secondNumber;

    }

    public int thirdNumberTheBiggest(int firstNumber, int secondNumber, int thirdNumber) {
        return thirdNumber;

    }

    public int firstAndSecondEqualBiggest(int firstNumber, int secondNumber, int thirdNumber) {
        return firstNumber == secondNumber && firstNumber > thirdNumber;

    }

    public int allEquals(int firstNumber, int secondNumber, int thirdNumber) {
        return firstNumber && secondNumber && thirdNumber;

    }

}
