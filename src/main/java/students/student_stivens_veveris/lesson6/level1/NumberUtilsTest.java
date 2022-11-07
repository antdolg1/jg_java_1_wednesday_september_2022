package students.student_stivens_veveris.lesson6.level1;

class NumberUtilsTest {

    public static void main(String[] args) {
        NumberUtilsTest numberUtilsTest = new NumberUtilsTest();
        numberUtilsTest.isEvenTest();
    }

    void isEvenTest() {
        NumberUtils numberUtils = new NumberUtils();
        boolean expectedResult = true;
        boolean actualResult = numberUtils.isEven(4);
        if (expectedResult == actualResult) {
            System.out.println("Test OK.");
        } else {
            System.out.println("Test FAILED.");
        }
    }
}
