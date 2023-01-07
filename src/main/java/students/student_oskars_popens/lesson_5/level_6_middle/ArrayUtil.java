package students.student_oskars_popens.lesson_5.level_6_middle;

class ArrayUtil {
    //task_34
    public static void printArrayToConsole(int[] array) {
        for (int number : array) {
            System.out.println(number);
        }
    }

    // task 35
    static int findMaxNumber(int[] array) {
        int maxNumber = array[0];
        for (int number : array) {
            if (number > maxNumber) {
                maxNumber = number;
            }
        }
        return maxNumber;
    }

    // task_37
    static int findMinNumber(int[] array){
        int minNumber = array[0];
        for (int number : array) {
            if (number < minNumber) {
                minNumber = number;
            }
        }
        return minNumber;
    }
}
