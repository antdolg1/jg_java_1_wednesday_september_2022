package students.student_svetlana_seda.lesson_6.homework.level_4.task_21;

public class TwoDimensionalArrayDemo {

    public static void main(String[] args) {

        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
        int[][] numbers;
        numbers = twoDimensionalArray.createArray(3);
        twoDimensionalArray.fillArrayWithRandomNumbers(numbers);
        twoDimensionalArray.printArrayToConsole(numbers);
        System.out.println("Sum of two dimensional array is " + twoDimensionalArray.sumOfTwoDimensionalArray(numbers));
    }

}
