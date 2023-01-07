package students.student_oskars_popens.lesson_5.level_2_intern;

import java.util.Random;

public class MyArrayUtils {
    public static int[] getRandomIntArray(int arrayLen) {
        Random rnd = new Random();
        int[] retArray = new int[arrayLen];
        for (int i = 0; i < retArray.length; i++) {
            retArray[i] = rnd.nextInt(1000);
        }
        return retArray;
    }

    public static int getAverage(int[] array) {
        int sumOfArray = 0;
        for (int i = 0; i < array.length; i++) {
            sumOfArray += array[i];
        }
        return sumOfArray / array.length;
    }

    public static void printArray(int[] array) {
        for (int nr : array) {
            System.out.printf(" %d", nr);
        }
    }

    public static int getSumOfArray(int[] array) {
        int sumOfArray = 0;
        for (int nr : array) {
            sumOfArray += nr;
        }
        return sumOfArray;
    }

    public static int getMaxOfArray(int[] array) {
        int maxNr = array[0];
        for (int nr : array) {
            if (maxNr < nr) {
                maxNr = nr;
            }
        }
        return maxNr;
    }

    public static int getMinOfArray(int[] array) {
        int minNr = array[0];
        for (int nr : array) {
            if (minNr > nr) {
                minNr = nr;
            }
        }
        return minNr;
    }

    public static void printEvenNumbers(int[] array) {
        for (int nr : array) {
            if (nr % 2 == 0)
            {
                System.out.print(" " + nr);
            }
        }
    }

    public static void printOddNumbers(int[] array) {
        for (int nr : array) {
            if (nr %2 != 0)
            {
                System.out.print(" " + nr);
            }
        }
    }
}
