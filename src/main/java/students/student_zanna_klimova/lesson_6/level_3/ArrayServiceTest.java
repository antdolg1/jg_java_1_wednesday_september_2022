package students.student_zanna_klimova.lesson_6.level_3;

public class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        test.containsTestPassed();
        test.containsTestFailed();
        System.out.println("________________________________");
        test.countOccurrencesPassed();
        test.countOccurrencesFailed();
        System.out.println("_________________________________");


    }

    void containsTestPassed () {
        ArrayService arrayService = new ArrayService();
        boolean expectedResult = true;
        int[] arr = {1, 2, 3};
        boolean realResult = arrayService.contains(arr, 2);
        if (expectedResult == realResult) {
            System.out.println("Test 'containsTest' PASSED!");
        } else {
            System.out.println("Test 'containsTest' FAILED!");
        }
    }

    void containsTestFailed () {
        ArrayService arrayService = new ArrayService();
        boolean expectedResult = true;
        int[] arr = {1, 2, 3};
        boolean realResult = arrayService.contains(arr, 25);
        if (expectedResult == realResult) {
            System.out.println("Test 'containsTest' PASSED!");
        } else {
            System.out.println("Test 'containsTest' FAILED!");
        }
    }

    void countOccurrencesPassed(){
        ArrayService arrayService = new ArrayService();
        int expectedResult = 2;
        int[] arr = {1, 2, 3, 3};
        int realResult = arrayService.countOccurrences(arr, 3);
        if (expectedResult == realResult) {
            System.out.println("Test 'countOccurrencesTest' PASSED!");
        } else {
            System.out.println("Test 'countOccurrencesTest' FAILED!");
        }
    }

    void countOccurrencesFailed(){
        ArrayService arrayService = new ArrayService();
        int expectedResult = 2;
        int[] arr = {1, 2, 3, 35};
        int realResult = arrayService.countOccurrences(arr, 3);
        if (expectedResult == realResult) {
            System.out.println("Test 'countOccurrencesTest' PASSED!");
        } else {
            System.out.println("Test 'countOccurrencesTest' FAILED!");
        }
    }
}
