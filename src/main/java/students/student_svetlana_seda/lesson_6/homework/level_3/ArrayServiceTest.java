package students.student_svetlana_seda.lesson_6.homework.level_3;

import java.util.Arrays;

//напишите автоматические тесты
class ArrayServiceTest {

    public static void main(String[] args) {

        ArrayServiceTest arrayServiceTest = new ArrayServiceTest();
        arrayServiceTest.containsTest();
        arrayServiceTest.countOccurrencesTest();
        arrayServiceTest.replaceFirstTest();
        arrayServiceTest.replaceAllTest();
        arrayServiceTest.revertTest();
        arrayServiceTest.sortTest();

    }

    public void containsTest() {
        int[] array = {1, 2, 3, 4, 5};
        ArrayService arrayService = new ArrayService();
        if (arrayService.contains(array, 5)) {
            System.out.println("Contains Test is OK");
        } else {
            System.out.println("Contains Test is FAIL");
        }
        System.out.println();
    }

    public void countOccurrencesTest() {
        int[] array = {1, 2, 3, 3, 4};
        ArrayService arrayService = new ArrayService();
        if (arrayService.countOccurrences(array, 3) == 2) {
            System.out.println("Count Occurrences Test is OK");
        } else {
            System.out.println("Count Occurrences Test is FAIL");
        }
        System.out.println();
    }

    public void replaceFirstTest() {
        int[] array = {1, 2, 3};
        ArrayService arrayService = new ArrayService();
        if (arrayService.replaceFirst(array, 1, 5)) {
            System.out.println("Replace First Test is OK");
        } else {
            System.out.println("Replace First Test is FAIL");
        }
        System.out.println(Arrays.toString(array));
        System.out.println();
    }

    public void replaceAllTest() {
        int[] array = {1, 2, 3, 4, 5, 2, 6, 2};
        ArrayService arrayService = new ArrayService();
        int[] arrayWithReplacedNumbers = {1, 100, 3, 4, 5, 100, 6, 100};
        int replacedNumber = arrayService.replaceAll(array, 2, 100);
        if (Arrays.equals(array, arrayWithReplacedNumbers)) {
            System.out.println("Replaced numbers  in array test = OK");
        } else {
            System.out.println("Replaced numbers in array test = FAIL");
        }
        System.out.println(Arrays.toString(array));
        System.out.println();
    }

    void revertTest() {
        ArrayService arrayService = new ArrayService();
        int[] array = {1, 2, 3, 4, 5};
        int[] revertedArray = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(array));
        arrayService.revert(array);
        if (Arrays.equals(array, revertedArray)) {
            System.out.println("Array revert Test is OK");
        } else {
            System.out.println("Array revert Test is FAIL");
        }
        System.out.println(Arrays.toString(revertedArray));
        System.out.println();
    }

    void sortTest() {
        ArrayService arrayService = new ArrayService();
        int[] array = {4, 5, 2, 1, 3};
        int[] sortedArray = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));
        arrayService.sort(array);

        if (Arrays.equals(array, sortedArray)) {
            System.out.println("Sorted array test is OK");
        } else {
            System.out.println("Sorted array test is FAIL");
        }
        System.out.println(Arrays.toString(sortedArray));
    }

}

