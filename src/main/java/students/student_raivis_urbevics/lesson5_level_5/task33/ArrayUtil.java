package students.student_raivis_urbevics.lesson5_level_5.task33;

 class ArrayUtil {

    public void fillArrayWithRandomNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 100));
        }
    }
}
