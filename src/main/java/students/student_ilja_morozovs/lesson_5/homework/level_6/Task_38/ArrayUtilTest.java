package students.student_ilja_morozovs.lesson_5.homework.level_6.Task_38;

class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.checkMinNumTest();
    }

    void checkMinNumTest() {
        int arrayMinNumber = 1;
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = arrayUtil.createArray(3);
        int realArrayMinNumber = arrayUtil.findMinNumber(arrayUtil.fillArrayWithRandomNumber(array));
        arrayUtil.printArrayToConsole(array);
        if (arrayMinNumber == realArrayMinNumber) {
            System.out.println("Array min number OK");
        } else {
            System.out.println("Array min number FAIL");
        }
    }

    void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int arrayLength = 5;
        int arrayLengthResult = 5;
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
