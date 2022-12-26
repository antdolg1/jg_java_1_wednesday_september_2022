package students.student_sergejs_kozinecs.lesson_5.level_5.Task_32;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
    }

    public void shouldCreateArray() {
        int[] testArray = new ArrayUtil().createArray(10);
        int expectedArrayLength = 10;

        if (testArray.length == expectedArrayLength) {
            System.out.println("Array creation = OK");
        } else {
            System.out.println("Array creation = FALSE");
        }
    }

}
