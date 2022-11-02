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
    }
}
