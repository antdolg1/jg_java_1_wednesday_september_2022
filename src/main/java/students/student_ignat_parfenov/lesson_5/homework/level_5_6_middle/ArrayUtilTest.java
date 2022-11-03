package students.student_ignat_parfenov.lesson_5.homework.level_5_6_middle;

import static students.student_ignat_parfenov.lesson_5.homework.level_5_6_middle.ArrayUtil.createArray;

public class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
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
}

