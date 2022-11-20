package students.student_artjoms_trosihins.lesson_4.level_4.task_14;

class Calculator {

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {

        if (firstNumber > secondNumber) {
            return firstNumber;
        } else if (secondNumber > firstNumber) {
            return secondNumber;
        } else {
            return firstNumber;
        }
    }
}
