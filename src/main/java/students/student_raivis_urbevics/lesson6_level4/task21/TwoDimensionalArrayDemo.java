package students.student_raivis_urbevics.lesson6_level4.task21;

import java.util.Arrays;

class TwoDimensionalArrayDemo {

    public static void main(String[] args) {
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
        int[][] numbers;
        numbers = twoDimensionalArray.arrayCreate(3);
        twoDimensionalArray.arrayWithRandomNumber(numbers);
        twoDimensionalArray.printArrayToConsole(numbers);
        System.out.println("Two Dimensional Array Sum = " + twoDimensionalArray.sumOfTwoRandomDimensionalArray(numbers));
    }
}
