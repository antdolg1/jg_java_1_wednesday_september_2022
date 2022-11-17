package students.student_raivis_urbevics.lesson5_level6;

import java.util.Arrays;

class ArrayUtilTest {
    public static void main(String[] args) {

        ArrayUtilTest arrayUtilTest = new ArrayUtilTest();
        arrayUtilTest.shouldCreateArray();
        arrayUtilTest.shouldPrintToConsoleArray();
        arrayUtilTest.shouldFindMaxNumber();
        arrayUtilTest.shouldFindMinNumber();


    }

    public void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        arrayUtil.createArray(3);
    }

    public void shouldPrintToConsoleArray() {
        int[] numbers = {12, 43, 34};
        ArrayUtil arrayUtil = new ArrayUtil();
        arrayUtil.printArrayToConsole(numbers);
    }


    public void shouldFindMaxNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] numbers = {12, 43, 34};
        int expectedResult = 43;
        int realResult = arrayUtil.findMaxNumber(numbers);
        if (expectedResult == realResult) {
            System.out.println("Should find Max number test = OK");
        } else {
            System.out.println("Should find Max number test = FAIL");
        }
        System.out.println("Max Number of Array = " + arrayUtil.findMaxNumber(numbers));
    }

    public void shouldFindMinNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] numbers = {12, 43, 34};
        int expectedResult = 12;
        int realResult = arrayUtil.findMinNumber(numbers);
        if (expectedResult == realResult) {
            System.out.println("Should find Min number test = OK");
        } else {
            System.out.println("Should find Min number test = FAIL");
        }
        System.out.println("Min Number of Array = " + arrayUtil.findMinNumber(numbers));
    }
}
