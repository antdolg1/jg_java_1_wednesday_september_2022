package students.student_zanna_klimova.lesson_5.level_5;

public class ArrayUtil {
    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println((int) (Math.random() * 100));
        }
    }
}
