package students.student_danila_kolesnicenko.lesson5;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = arrayUtil.createArray(5);
        if (array.length == 5) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }

    public void shouldFindMaxNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = arrayUtil.createArray(7);
        array = arrayUtil.fillArrayWithRandomNumbers(array);
        System.out.println(arrayUtil.findMaxNumber(array));
    }

    public void shouldFindMinNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = arrayUtil.createArray(7);
        array = arrayUtil.fillArrayWithRandomNumbers(array);
        System.out.println(arrayUtil.findMinNumber(array));
    }
}

