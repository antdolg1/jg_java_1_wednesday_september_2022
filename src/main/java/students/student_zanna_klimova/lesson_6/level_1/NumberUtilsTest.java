package students.student_zanna_klimova.lesson_6.level_1;

public class NumberUtilsTest {
    public static void main(String[] args) {
        NumberUtilsTest numberUtilsTest = new NumberUtilsTest();
        numberUtilsTest.isEvenTest();
    }

    void isEvenTest() {
        NumberUtils numberUtils = new NumberUtils();
        boolean expectedResult = false;
        boolean actualResult = numberUtils.isEven(4);
        if (expectedResult == actualResult) {
            System.out.println("Test OK.");
        } else {
            System.out.println("Test FAILED.");
        }
    }
}
