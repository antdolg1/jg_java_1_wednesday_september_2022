package students.student_jurij_hlebnikov.homework_leson_6;

public class ArrayServiceTest {

    public static void main(String[] args) {

        ArrayServiceTest test = new ArrayServiceTest();
        test.shouldContainTest();
        test.shouldNotContainTest();

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
}