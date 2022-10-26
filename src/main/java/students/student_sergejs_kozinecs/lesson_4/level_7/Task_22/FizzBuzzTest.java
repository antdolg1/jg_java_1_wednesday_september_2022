package students.student_sergejs_kozinecs.lesson_4.level_7.Task_22;

class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.fizzTest();
        fizzBuzzTest.buzzTest();
        fizzBuzzTest.fizzBuzzTest();
        fizzBuzzTest.returnStringNumberTest();
    }

    void printResult(String testTitle, boolean result) {
        if (result) {
            System.out.println(testTitle + " test OK");
        } else {
            System.out.println(testTitle + " test FALSE");
        }
    }

    void fizzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 9;
        String expectedResult = "Fizz";

        printResult("Fizz", fizzBuzz.detect(number).equals(expectedResult));
    }

    void buzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 10;
        String expectedResult = "Buzz";

        printResult("Buzz", fizzBuzz.detect(number).equals(expectedResult));
    }

    void fizzBuzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 15;
        String expectedResult = "FizzBuzz";

        printResult("FizzBuzz", fizzBuzz.detect(number).equals(expectedResult));
    }

    void returnStringNumberTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 11;
        String expectedResult = "11";

        printResult("Return string number", fizzBuzz.detect(number).equals(expectedResult));
    }
}
