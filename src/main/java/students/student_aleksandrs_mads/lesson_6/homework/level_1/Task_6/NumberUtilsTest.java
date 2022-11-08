package students.student_aleksandrs_mads.lesson_6.homework.level_1.Task_6;

class NumberUtilsTest {
    public static void main(String[] args) {
        NumberUtilsTest numberUtilsTest = new NumberUtilsTest();
        numberUtilsTest.isEvenTest();
    }

    void isEvenTest() {
        NumberUtils numberUtils = new NumberUtils();
        if (numberUtils.isEven(22)) {
            System.out.println("Even test Ok");
        } else {
            System.out.println("Even test fail");
        }
    }
}
