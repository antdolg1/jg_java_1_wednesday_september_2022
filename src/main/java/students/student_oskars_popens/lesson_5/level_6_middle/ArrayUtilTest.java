package students.student_oskars_popens.lesson_5.level_6_middle;

class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldFindMaxNumber(); //Test_36
        test.shouldFindMinNumber(); //Test_38
    }

    public void shouldFindMaxNumber() {
        int[] array = {23,23,345,46,67,23,46,68,56,5,88776,44};
        int expectedValue = 88776;
        int realValue = ArrayUtil.findMaxNumber(array);
        if (expectedValue == realValue){
            System.out.println("Find max value in array test is = OK");
        } else {
            System.out.println("Find max value in array test is = FAIL");
        }

    }

    public void shouldFindMinNumber() {
        int[] array = {23,23,345,46,67,23,46,68,56,5,88776,44};
        int expectedValue = 5;
        int realValue = ArrayUtil.findMinNumber(array);
        if (expectedValue == realValue){
            System.out.println("Find min value in array test is = OK");
        } else {
            System.out.println("Find min value in array test is = FAIL");
        }

    }
}