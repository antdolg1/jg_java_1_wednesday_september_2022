package students.student_sergejs_kozinecs.lesson_5.level_6.Task_35;

class ArrayUtil {

    public int findMaxNumber(int[] array) {
        int maxNumber = 0;

        for (int number : array) {
            if (number > maxNumber) {
                maxNumber = number;
            }
        }

        return maxNumber;
    }

}
