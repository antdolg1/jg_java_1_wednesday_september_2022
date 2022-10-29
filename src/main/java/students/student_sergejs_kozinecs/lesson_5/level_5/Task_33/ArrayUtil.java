package students.student_sergejs_kozinecs.lesson_5.level_5.Task_33;

class ArrayUtil {

    public void fillArrayWithRandomNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100) + 1;
        }
    }

}