package students.student_ignat_parfenov.lesson_6.homework.level_1_intern.Task6;

class NumberUtilsTest {

    public static void main(String[] args) {
        NumberUtilsTest numberUtilsTest = new NumberUtilsTest();
        numberUtilsTest.isEvenTest(45);
    }

    void isEvenTest(int number) {
        NumberUtils numberUtils = new NumberUtils();
        isEvenNumberCondition(numberUtils.isEven(number));
    }

    void isEvenNumberCondition(boolean condition) {
        if (condition) {
            System.out.println("Even number test is DONE");
        } else {
            System.out.println("Even number test is FAILED");
        }
    }
}



