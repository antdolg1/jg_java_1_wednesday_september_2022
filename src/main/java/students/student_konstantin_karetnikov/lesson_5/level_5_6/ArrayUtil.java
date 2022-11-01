package students.student_konstantin_karetnikov.lesson_5.level_5_6;

class ArrayUtil {
    static int[] createArray(int arrayLength) {

        return new int[arrayLength];
    }

    static void fillArrayWithRandomNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * array.length);
        }
    }



    void printArrayToConsole(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
    }

    public static int findMaxNumber(int[] array) {
        int maxNumber = array[0];

        for (int i : array) {
            if (i > maxNumber) {
                maxNumber = i;
            }
        }
        return maxNumber;
    }

    public static int findMinNumber(int[] array) {
        int minNumber = array[0];

        for (int i : array) {
            if (i < minNumber) {
                minNumber = i;
            }
        }
        return minNumber;
    }
    }

