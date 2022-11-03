package students.student_ignat_parfenov.lesson_5.homework.level_5_6_middle;

import static students.student_ignat_parfenov.lesson_5.homework.level_5_6_middle.ArrayUtil.*;

public class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {
        int arrayLength = 8;
        int[] currentResult = createArray(arrayLength);
        int expectedResult = 8;

        if (currentResult.length == expectedResult) {
            System.out.println("Array length test is DONE.");
        } else {
            System.out.println("Current test is FAILED");
        }
    }

    public void shouldFindMaxNumber() {
        int[] array = {2, 6, 78, 56, 18};
        int expectedResult = 65;
        int currentResult = findMaxNumberInArray(array);

        if (expectedResult == currentResult) {
            System.out.println("Test of max number finding is DONE!");
        } else {
            System.out.println("Max test is FAILED");
        }
    }

    public void shouldFindMinNumber() {
        int[] array = {2, 6, 78, 56, 18};
        int expectedResult = 2;
        int currentResult = findMinNumberInArray(array);

        if (expectedResult == currentResult) {
            System.out.println("Test of min number finding is DONE");
        } else {
            System.out.println("Min test is FAILED");
        }
    }
}
