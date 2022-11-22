package students.student_raivis_urbevics.lesson6_level3.task12;

import java.util.Arrays;

class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest arrayServiceTest = new ArrayServiceTest();
        arrayServiceTest.containsTest();
        arrayServiceTest.countOccurrencesTest();
        arrayServiceTest.replaceFirstTest();
        arrayServiceTest.replaceAllTest();
        arrayServiceTest.revertArrayTest();
        arrayServiceTest.sortArrayTest();

    }

    public void containsTest() {
        int[] arrNumbers = {21, 12, 43, 33, 34};
        ArrayService arrayService = new ArrayService();
        if (arrayService.contains(arrNumbers, 12)) {
            System.out.println("Contains Test is OK");
        } else {
            System.out.println("Contains Test is FAIL");
        }
    }

    public void countOccurrencesTest() {
        int[] arrNumbers = {21, 43, 43, 43, 34};
        ArrayService arrayService = new ArrayService();
        if (arrayService.countOccurrences(arrNumbers, 43) == 3) {
            System.out.println("Count Occurrences Test is OK");
        } else {
            System.out.println("Count Occurrences Test is FAIL");
        }
    }

    public void replaceFirstTest() {
        int[] arrNumbers = {43, 43, 76, 56, 34};
        ArrayService arrayService = new ArrayService();
        if (arrayService.replaceFirst(arrNumbers, 43, 65)) {
            System.out.println("Replace First Test is OK");
        } else {
            System.out.println("Replace First Test is FAIL");
        }
        System.out.println(Arrays.toString(arrNumbers));
    }

    public void replaceAllTest() {
        int[] arrNumbers = {21, 56, 56, 56, 34};
        ArrayService arrayService = new ArrayService();
        if (arrayService.replaceAll(arrNumbers, 56, 65) == 3) {
            System.out.println("Replace All Test is OK");
        } else {
            System.out.println("Replace All Test is FAIL");
        }
        System.out.println(Arrays.toString(arrNumbers));
    }


    public void revertArrayTest() {
        ArrayService arrayService = new ArrayService();
        int[] arrNumbers = {21, 56, 65, 45, 34};
        System.out.println("Original Array = " + Arrays.toString(arrNumbers));
        arrayService.revertArray(arrNumbers);
        System.out.println("Revert Array = " + Arrays.toString(arrNumbers));
    }

    public void sortArrayTest() {
        ArrayService arrayService = new ArrayService();
        int[] arrNumbers = {21, 56, 76, 32, 34};
        System.out.println("Original Array = " + Arrays.toString(arrNumbers));
        arrayService.sortArray(arrNumbers);
        System.out.println("Sort Array from lesser num  to greater num  = " + Arrays.toString(arrNumbers));
    }
}
