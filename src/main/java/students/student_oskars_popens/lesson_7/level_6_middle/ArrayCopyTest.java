package students.student_oskars_popens.lesson_7.level_6_middle;

class ArrayCopyTest {

    public static void main(String[] args) {
        ArrayCopyTest test = new ArrayCopyTest();
        test.shouldCopyArray();
        test.shouldCopyArrayNegativeTest();
    }

    private void shouldCopyArray() {
        ArrayCopy arrayCopy = new ArrayCopy();
        int[] arrayFrom = {1, 2, 3, 11, 4, 12, 5, 6, 78, 9, 443, 234, 55, 34, 23, 15, 46, 67, 78, 45, 34, 2};
        int[] expectedArray = {11, 12, 15};
        int minNr = 10, maxNr = 20;
        boolean result = compareIntArray(expectedArray, arrayCopy.copyInRange(arrayFrom, minNr, maxNr));
        checkTestResult(result, "Array copy test");
    }

    private void shouldCopyArrayNegativeTest() {
        ArrayCopy arrayCopy = new ArrayCopy();
        int[] arrayFrom = {1, 2, 3, 11, 4, 12, 5, 6, 78, 9, 443, 234, 55, 34, 23, 15, 46, 67, 78, 45, 34, 2};
        int[] expectedArray = {11, 12, 22};
        int minNr = 10, maxNr = 20;
        boolean result = compareIntArray(expectedArray, arrayCopy.copyInRange(arrayFrom, minNr, maxNr));
        checkTestResult(!result, "Array copy negative test ");
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }

    private boolean compareIntArray(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
}
