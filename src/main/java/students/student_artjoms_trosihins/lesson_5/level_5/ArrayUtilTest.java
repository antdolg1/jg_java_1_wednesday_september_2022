package students.student_artjoms_trosihins.lesson_5.level_5;

import java.util.Arrays;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
    }

    public void shouldCreateArray() {

        ArrayUtil victim = new ArrayUtil();

        int[] expectedResult = new int[10];
        int[] actualResult = victim.createArray(10);

        if (Arrays.equals(expectedResult, actualResult)) {
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed!");
        }
        System.out.println("Expected result " + Arrays.toString(expectedResult)
                + "actualResult" + Arrays.toString(actualResult));
    }
}
