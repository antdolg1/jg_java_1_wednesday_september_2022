package students.student_zanna_klimova.lesson_5.level_5;

import teacher.lesson_5.homework.level_7_senior.task_41.ArrayUtil;

public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest arrayUtilTest = new ArrayUtilTest();
        arrayUtilTest.shouldCreateArray();
        arrayUtilTest.shouldFindMaxNumber();
        arrayUtilTest.shouldFindMinNumber();

    }
    void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int arrayLength = 4;
        int[] realResult = arrayUtil.newArray(arrayLength);
        int expectedResult = 4;

        if (realResult.length == expectedResult) {
            System.out.println("Array length test OK");
        } else {
            System.out.println("Array length test FAIL");
        }

    }

    void shouldFindMaxNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {11, 5, 10, 8, 5};
        int expectedResult = 101;
        int realResult = arrayUtil.findMaxInArray(array);

        if (realResult == expectedResult) {
            System.out.println("Max number test OK");
        } else {
            System.out.println("Max number test FAIL");
        }
    }
    void shouldFindMinNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {2, 8, 10, 3, 6};
        int expectedResult = 2;
        int realResult = arrayUtil.findMinInArray(array);

        if (realResult == expectedResult) {
            System.out.println("Min number test OK");
        } else {
            System.out.println("Min number test FAIL");
        }

    }
}
