package students.student_ilja_morozovs.lesson_4.homework.level_7.Task_22;

class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.fizzBuzzTest();
    }

    void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " OK");
        } else {
            System.out.println(testName + " FAIL");
        }
    }

    void fizzBuzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        check(fizzBuzz.detect(15).equals("FizzBuzz"), "TEST FIZZBUZZ");
    }
}
