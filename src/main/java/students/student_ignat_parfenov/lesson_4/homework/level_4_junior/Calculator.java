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

    public boolean maximum(int firstNumber, int secondNumber, int thirdNumber) {
        return firstNumber > secondNumber;
        return firstNumber > thirdNumber;
        return secondNumber > firstNumber;
        return secondNumber > thirdNumber;
        return thirdNumber > firstNumber;
        return thirdNumber > secondNumber;
    }
}

