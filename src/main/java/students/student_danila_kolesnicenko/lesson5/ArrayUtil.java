package students.student_danila_kolesnicenko.lesson5;

class ArrayUtil {

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];

        // int[]array = new int[arrayLength];    same as on top
        //  return array;
    }

    public int[] fillArrayWithRandomNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 67);
            System.out.println(array[i]);
        }
        return array;

    }

    public void printArrayToConsole(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public int findMaxNumber(int[] array) {
        {
            int maxNumber = 0;

            for (int i = 0; i < array.length; i++) {
                if (array[i] > maxNumber) {
                    maxNumber = array[i];
                }
            }
            return maxNumber;
        }
    }

    public int findMinNumber(int[] array) {
        int minNumber = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < minNumber) {
                minNumber = array[i];
            }
        }
        return minNumber;
    }


}




