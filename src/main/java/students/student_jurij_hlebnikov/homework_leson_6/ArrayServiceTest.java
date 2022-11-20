package students.student_jurij_hlebnikov.homework_leson_6;

class ArrayServiceTest {

    public static void main(String[] args) {

        ArrayServiceTest test = new ArrayServiceTest();
        test.shouldContainTest();
        test.shouldNotContainTest();
        test.shouldContainThisNumberTest();
        test.shouldNotContainThisNumberTest();
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

    private void checkResult(boolean result, String name) {
        if (result) {
            System.out.println(name + " OK!");
        } else {
            System.out.println(name + " FAIL!");
        }
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
}