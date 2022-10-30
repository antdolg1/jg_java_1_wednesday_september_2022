package students.student_ilja_morozovs.lesson_5.homework.level_6.Task_37;

class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
    }

    void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int arrayLength = 5;
        int arrayLengthResult = 8;
        int[] realArrayResult = arrayUtil.createArray(arrayLength);
        checkArrayLength(realArrayResult, arrayLengthResult);
    }

    void checkArrayLength(int[] realArrayResult, int arrayLength) {
        if (realArrayResult.length == arrayLength) {
            System.out.println("Array length TEST = OK");
        } else {
            System.out.println("Array length TEST = FAIL");
        }
    }
}
