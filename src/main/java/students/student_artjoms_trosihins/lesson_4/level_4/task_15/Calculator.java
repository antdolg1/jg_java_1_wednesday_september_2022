package students.student_artjoms_trosihins.lesson_4.level_4.task_15;

class Calculator {

    public int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {

        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            return firstNumber;
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            return secondNumber;
        } else if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
            return thirdNumber;
        } else {
            return firstNumber;
        }
    }
}
