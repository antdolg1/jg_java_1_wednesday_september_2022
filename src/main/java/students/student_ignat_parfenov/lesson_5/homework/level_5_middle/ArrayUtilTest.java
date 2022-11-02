package students.student_ignat_parfenov.lesson_5.homework.level_5_middle;

import static students.student_ignat_parfenov.lesson_5.homework.level_5_middle.ArrayUtil.createArray;

public class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
    }

    public void shouldCreateArray() {
        int arrayLength = 7;
        int[] currentResult = createArray(arrayLength);
        int expectedResult = 7;

        if (currentResult.length == expectedResult) {
            System.out.println("Array length is correct.");
        } else {
            System.out.println("Current tes is FAILED");
        }
    }
}
