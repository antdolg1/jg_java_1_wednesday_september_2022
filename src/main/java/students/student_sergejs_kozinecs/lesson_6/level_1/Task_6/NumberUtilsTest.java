package students.student_sergejs_kozinecs.lesson_6.level_1.Task_6;

public class NumberUtilsTest {
    public static void main(String[] args) {
        NumberUtilsTest utilsTest = new NumberUtilsTest();
        utilsTest.testIsEven();
    }

    void testIsEven() {
        boolean expectedResult = true;
        int testNumber = 20;

        if (NumberUtils.isEven(testNumber) == expectedResult) {
            System.out.println("Is even test = OK");
        } else {
            System.out.println("Is even test = False");
        }
    }
}
