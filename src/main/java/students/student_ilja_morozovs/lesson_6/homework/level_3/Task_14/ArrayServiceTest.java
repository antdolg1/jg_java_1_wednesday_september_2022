package students.student_ilja_morozovs.lesson_6.homework.level_3.Task_14;

import java.util.Arrays;
import java.util.Scanner;

class ArrayServiceTest {

    public static void main(String[] args) {
        ArrayServiceTest arrayServiceTest = new ArrayServiceTest();
        int[] arr = {10, 10, 23, 0, 0};
        System.out.println(Arrays.toString(arr));
        arrayServiceTest.condition(arrayServiceTest.changeFirstTest(arr, 5 ));
        System.out.println(Arrays.toString(arr));
    }

    boolean changeFirstTest(int[] arr, int testedNewNumber) {
        ArrayService arrayService = new ArrayService();
        arrayService.changeFirst(arr, 10, 5);
        for (int j : arr) {
            if (j == testedNewNumber) {
                return true;
            }
        }
        return false;
    }

    void condition(boolean state) {
        if (state) {
            System.out.println("Test is: OK");
        } else {
            System.out.println("Test is: FAIL");
        }
    }


//    int testInputDate() {
//        Scanner scanner = new Scanner(System.in);
//        return scanner.nextInt();
//    }

//    boolean countNumberOccurrencesPositiveResult(int[] arr, int numberToSearch) {
//        ArrayService arrayService = new ArrayService();
//        int numberOccurrencesTest = 0;
//        return arrayService.countNumberOccurrences(arr, numberToSearch) != numberOccurrencesTest;
//    }
//
//    boolean countNumberOccurrencesNegativeResult(int[] arr, int numberToSearch) {
//        ArrayService arrayService = new ArrayService();
//        int numberOccurrencesTest = 0;
//        return arrayService.countNumberOccurrences(arr, numberToSearch) == numberOccurrencesTest;
//    }
//    int[] createTestedArray(int arrayLength) {
//        return new int[arrayLength];
//    }
//
//    void fillArrayTest(int[] arr) {
//        int testNumber = 44;
//        System.out.println("Tested number in array is :" + testNumber);
//        arr[2] = testNumber;
//    }
//
//    int[] fillArray(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            Random random = new Random();
//            arr[i] = random.nextInt(100);
//        }
//        return arr;
//    }
}
