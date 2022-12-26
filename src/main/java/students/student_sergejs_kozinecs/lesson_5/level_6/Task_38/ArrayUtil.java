package students.student_sergejs_kozinecs.lesson_5.level_6.Task_38;

class ArrayUtil {

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public void printArrayToConsole(int[] array) {
        for (int item : array) {
            System.out.println(item);
        }
    }

    public int findMaxNumber(int[] array) {
        int maxNumber = 0;

        for (int number : array) {
            if (number > maxNumber) {
                maxNumber = number;
            }
        }

        return maxNumber;
    }

    public int findMinNumber(int[] array) {
        int minNumber = array[0];

        for (int number : array) {
            if (number < minNumber) {
                minNumber = number;
            }
        }

        return minNumber;
    }

}
