package students.student_jurij_hlebnikov.homework_leson_6;

class ArrayServiceTest {

    public static void main(String[] args) {

        ArrayServiceTest test = new ArrayServiceTest();
        test.shouldContainTest();
        test.shouldNotContainTest();
        test.shouldContainThisNumberTest();
        test.shouldNotContainThisNumberTest();
        test.shouldChangeFirst();

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

    public void shouldChangeFirst() {
        int[] array = new int[]{31, 41, 51, 61};
        ArrayService arrayService = new ArrayService();
        int changeNumber = arrayService.replaceFirst(array, 31, 4);
        //boolean result = changeNumber;
        //checkResult(result,"shouldChangeFirstTest:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }   //            System.out.println(changeNumber);

    }

    private void checkResult(boolean result, String name) {
        if (result) {
            System.out.println(name + " OK!");
        } else {
            System.out.println(name + " FAIL!");
        }
    }
}