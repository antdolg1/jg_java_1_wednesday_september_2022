package students.student_ilja_morozovs.lesson_6.homework.level_1.Task_6;

class NumberUtilsTest {

    public static void main(String[] args) {
        NumberUtilsTest numberUtilsTest = new NumberUtilsTest();
        numberUtilsTest.isEvenTest(32);
    }

    void isEvenTest(int number) {
        NumberUtils numberUtils = new NumberUtils();
        isEvenCondition(numberUtils.isEven(number));
    }

    void isEvenCondition(boolean condition) {
        if (condition) {
            System.out.println("Test is: OK");
        } else {
            System.out.println("Test is: FAIL");
        }
    }

}
