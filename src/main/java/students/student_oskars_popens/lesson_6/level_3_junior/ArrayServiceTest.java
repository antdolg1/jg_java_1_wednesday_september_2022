package students.student_oskars_popens.lesson_6.level_3_junior;

class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest arrayServiceTest = new ArrayServiceTest();
        // task_12
        arrayServiceTest.shouldBeInArray();
        // task_13
        arrayServiceTest.shouldBeMoreOccInArray();
        arrayServiceTest.shouldNotBeOccInArray();
        // task_14
        arrayServiceTest.shouldReplaceFirstOcc();
        arrayServiceTest.shouldNotReplaceFirstOcc();
        // task_15
        arrayServiceTest.shouldReplaceAllOcc();
        arrayServiceTest.shouldNotReplaceAllOcc();
        // task_16
        arrayServiceTest.shouldBeReverted();
        // task_17
        arrayServiceTest.shouldBeSorted();

    }

    // task_12
    void shouldBeInArray() {
        ArrayService arrayService = new ArrayService();
        int[] myArray = {12, 23, 34, 45, 56, 567, 78, 89, 90};
        checkTestResult(arrayService.contains(myArray, 45),
                "Array contains test");
    }

    // task_13
    void shouldBeMoreOccInArray() {
        ArrayService arrayService = new ArrayService();
        int[] myArray = {12, 23, 3, 34, 45, 3, 56, 567, 3, 89, 90, 3};
        int occ = arrayService.countOccurrences(myArray, 3);
        checkTestResult(4 == occ, "Array occurrence test with contains number in array");
    }

    // task_13
    void shouldNotBeOccInArray() {
        ArrayService arrayService = new ArrayService();
        int[] myArray = {12, 23, 3, 34, 45, 3, 56, 567, 3, 89, 90, 3};
        int occ = arrayService.countOccurrences(myArray, 9);
        checkTestResult(0 == occ, "Array occurrence test without contains number in array");
    }

    // task_14
    void shouldReplaceFirstOcc() {
        ArrayService arrayService = new ArrayService();
        int[] myArray = {12, 23, 3, 34, 45, 3, 56, 567, 3, 89, 90, 3};
        boolean res = arrayService.replaceFirstNumberInArray(myArray, 3, 99);
        checkTestResult((res && 99 == myArray[2]), "Found and replace first occurrence in array");
    }

    // task_14
    void shouldNotReplaceFirstOcc() {
        ArrayService arrayService = new ArrayService();
        int[] myArray = {12, 23, 3, 34, 45, 3, 56, 567, 3, 89, 90, 3};
        boolean res = arrayService.replaceFirstNumberInArray(myArray, 101, 99);
        checkTestResult(!res, "Not found number in array to replace");
    }

    // task_15
    void shouldReplaceAllOcc() {
        ArrayService arrayService = new ArrayService();
        int[] myArray = {12, 23, 3, 34, 45, 3, 56, 567, 3, 89, 90, 3};
        int replaced = arrayService.replaceAllNumberInArray(myArray, 3, 99);
        checkTestResult(4 == replaced, "Found and replace 4 occurrence in array");
    }

    // task_15
    void shouldNotReplaceAllOcc() {
        ArrayService arrayService = new ArrayService();
        int[] myArray = {12, 23, 3, 34, 45, 3, 56, 567, 3, 89, 90, 3};
        int replaced = arrayService.replaceAllNumberInArray(myArray, 101, 99);
        checkTestResult(0 == replaced, "Not found any number in array to replace");
    }

    // task_16
    void shouldBeReverted() {
        ArrayService arrayService = new ArrayService();
        int[] myArray = {12, 23, 3, 34, 45, 3, 56, 567, 3, 89, 90, 3};
        int[] expectedRevertArray = {3, 90, 89, 3, 567, 56, 3, 45, 34, 3, 23, 12};
        boolean reverted = true;

        // revert array
        arrayService.arrayRevert(myArray);

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] != expectedRevertArray[i]) {
                reverted = false;
            }
        }
        checkTestResult(reverted, "Test Array revert");
    }

    // task_17
    void shouldBeSorted() {
        ArrayService arrayService = new ArrayService();
        int[] myArray = {12, 23, 3, 34, 45, 3, 56, 567, 3, 89, 90, 3};
        int[] expectedArray = {3, 3, 3, 3, 12, 23, 34, 45, 56, 89, 90, 567};
        boolean sortedArray = true;

        // sort array
        arrayService.arraySort(myArray);

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] != expectedArray[i]) {
                sortedArray = false;
            }
        }

        checkTestResult(sortedArray, "Test Array sort");
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }

}
