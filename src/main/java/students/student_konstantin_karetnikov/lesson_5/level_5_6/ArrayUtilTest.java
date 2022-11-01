package students.student_konstantin_karetnikov.lesson_5.level_5_6;

import static students.student_konstantin_karetnikov.lesson_5.level_5_6.ArrayUtil.createArray;
import static students.student_konstantin_karetnikov.lesson_5.level_5_6.ArrayUtil.findMaxNumber;
import static students.student_konstantin_karetnikov.lesson_5.level_5_6.ArrayUtil.findMinNumber;

class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest arrayUtilTest = new ArrayUtilTest();
        arrayUtilTest.shouldCreateArray();
        arrayUtilTest.shouldFindMaxNumber();
        arrayUtilTest.shouldFindMinNumber();
    }

    void shouldCreateArray() {
        int arrayLength = 5;
        int[] realResult = createArray(arrayLength);
        int expectedResult = 5;

        if (realResult.length == expectedResult) {
            System.out.println("Array length test OK");
        } else {
            System.out.println("Array length test FAIL");
        }

    }

    void shouldFindMaxNumber() {
        int[] array = {1, 5, 10,7, 6};
        int expectedResult = 10;
        int realResult = findMaxNumber(array);

        if (realResult == expectedResult) {
            System.out.println("Max number test OK");
        } else {
            System.out.println("Max number test FAIL");
        }

    }

    void shouldFindMinNumber() {
        int[] array = {1, 5, 10,7, 6};
        int expectedResult = 1;
        int realResult = findMinNumber(array);

        if (realResult == expectedResult) {
            System.out.println("Min number test OK");
        } else {
            System.out.println("Min number test FAIL");
        }

    }
}

