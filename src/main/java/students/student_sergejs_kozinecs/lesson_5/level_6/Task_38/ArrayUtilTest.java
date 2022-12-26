package students.student_sergejs_kozinecs.lesson_5.level_6.Task_38;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
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

    public void shouldFindMaxNumber() {
        int[] testArray = { 1, 50, 34, 99, 2 };
        int expectedMaxNumber = 99;
        int utilMaxNumber = new ArrayUtil().findMaxNumber(testArray);

        if (utilMaxNumber == expectedMaxNumber) {
            System.out.println("Max number test = OK");
        } else {
            System.out.println("Max number test = FALSE");
        }
    }

    public void shouldFindMinNumber() {
        int[] testArray = { 1, 50, 34, 99, 2 };
        int expectedMaxNumber = 1;
        int utilMaxNumber = new ArrayUtil().findMinNumber(testArray);

        if (utilMaxNumber == expectedMaxNumber) {
            System.out.println("Min number test = OK");
        } else {
            System.out.println("Min number test = FALSE");
        }
    }
}
