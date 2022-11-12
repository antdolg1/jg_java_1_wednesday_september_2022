package teacher.lesson_7.lessoncode;

public class MaxNumberApp {

    public int maxOfTwoNumbers(int numberOne, int numberTwo) {
        if (numberOne > numberTwo) {
            return numberOne;
        } else {
            return numberTwo;
        }
    }

    public int maxOfTwoNumbersV2(int numberOne, int numberTwo) {
        return numberOne > numberTwo ? numberOne : numberTwo;
    }

    public int maxOfTwoNumbersV3(int numberOne, int numberTwo) {
        return Math.max(numberOne, numberTwo);
    }

    public int maxOfThreeNumbers(int numberOne, int numberTwo, int numberThree) {
//        int maxOfFirstTwoNumbers = Math.max(numberOne, numberTwo);
        return Math.max(Math.max(numberOne, numberTwo), numberThree);
    }
}
