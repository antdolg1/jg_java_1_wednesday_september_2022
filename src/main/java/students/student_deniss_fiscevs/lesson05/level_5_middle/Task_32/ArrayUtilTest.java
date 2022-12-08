package students.student_deniss_fiscevs.lesson05.level_5_middle.Task_32;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
    }

    void shouldCreateArray() {
        ArrayUtil victim = new ArrayUtil();
        int arrayLength = 5;
        int arrayLengthResult = 10;
        int[] realArrayResult = victim.createArray(arrayLength);
        checkArrayLength(realArrayResult, arrayLengthResult);
    }

    void checkArrayLength(int[] realArrayResult, int arrayLength) {
        if (realArrayResult.length == arrayLength) {
            System.out.println("OK");
        } else {
            System.out.println("FAIL");
        }
    }
}


