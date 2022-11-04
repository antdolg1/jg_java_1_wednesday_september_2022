package students.student_ignat_parfenov.lesson_6.homework.level_1_intern.Task6;

class NumberEvenUtilsTest {
    public static void main(String[] args) {

        NumberEvenUtilsTest numberUtilsTest = new NumberEvenUtilsTest();
    }

    void isEvenTest() {

        NumberUtils isNumberEven = new NumberUtils();
        if (isNumberEven.isEven(13)) {
            System.out.println("Even number test is DONE.");
        } else {
            System.out.println("Even number test is FAILED");
        }
    }
}



