package students.student_jurij_hlebnikov.homework_leson_6;

class ArrayServiceTest {

    public static void main(String[] args) {

        ArrayServiceTest test = new ArrayServiceTest();
        test.shouldContainTest();
        test.shouldNotContainTest();
        test.shouldContainThisNumberTest();
        test.shouldNotContainThisNumberTest();
        test.shouldChangeFirstTest();
        test.shouldNotChangeFirstTest();
        test.shouldChangeAllTest();
        test.shouldNotChangeAllTest();

    }

    public void shouldContainTest() {
        int[] array = new int[]{23, 44};
        ArrayService arrayService = new ArrayService();
        boolean result = arrayService.contains(array, 44);
        checkResult(result, "shouldContainTest:");
    }

    public void shouldNotContainTest() {
        int[] array = new int[]{23, 44};
        ArrayService arrayService = new ArrayService();
        boolean result = arrayService.contains(array, 20);
        checkResult(!result, "shouldNotContainTest:");
    }


    public void shouldContainThisNumberTest() {
        int[] array = new int[]{4, 7, 5, 8, 5, 5, 5};
        ArrayService arrayService = new ArrayService();
        int matchResult = arrayService.countOccurrences(array, 5);
        boolean result = matchResult == 4;
        checkResult(result, "shouldContainThisNumberTest");
    }

    public void shouldNotContainThisNumberTest() {
        int[] array = new int[]{4, 7, 5, 8, 5, 5, 5};
        ArrayService arrayService = new ArrayService();
        int matchResult = arrayService.countOccurrences(array, 9);
        boolean result = matchResult == 0;
        checkResult(result, "shouldNotContainThisNumberTest");

    }

    public void shouldChangeFirstTest() {
        int[] array = new int[]{31, 41, 51, 61};
        ArrayService arrayService = new ArrayService();
        boolean numberIsChanged = arrayService.replaceFirst(array, 41, 4);
        checkResult(numberIsChanged, "shouldChangeFirstTest:");

    }

    public void shouldNotChangeFirstTest() {
        int[] array = new int[]{31, 41, 51, 61};
        ArrayService arrayService = new ArrayService();
        boolean numberIsChanged = arrayService.replaceFirst(array, 11, 4);
        checkResult(!numberIsChanged, "shouldNotChangeFirstTest:");

    }

    public void shouldChangeAllTest() {
        int[] arr = new int[]{13, 92, 37, 49, 81, 94, 75, 74, 92, 56, 92, 98};
        ArrayService arrayService = new ArrayService();
        int counter = arrayService.replaceAll(arr, 92, 3);
        boolean result = counter != 0;
        checkResult(result, "shouldChangeAllTest: ");
    }

    public void shouldNotChangeAllTest() {
        int[] arr = new int[]{13, 92, 37, 49, 81, 94, 75, 74, 92, 56, 92, 98};
        ArrayService arrayService = new ArrayService();
        int counter = arrayService.replaceAll(arr, 9, 3);
        boolean result = counter == 0;
        checkResult(result, "shouldNotChangeAllTest: ");
    }

    private void checkResult(boolean result, String name) {
        if (result) {
            System.out.println(name + " OK!");
        } else {
            System.out.println(name + " FAIL!");
        }
    }
}