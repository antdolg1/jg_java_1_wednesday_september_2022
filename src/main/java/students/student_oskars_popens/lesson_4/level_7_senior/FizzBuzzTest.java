package students.student_oskars_popens.lesson_4.level_7_senior;

class FizzBuzzTest {
    void detecFizzBuzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected, real;

        real = fizzBuzz.detect(3);
        expected = "Fizz";
        if (real.equals(expected)) {
            System.out.println("Test Fizz = Ok");
        } else {
            System.out.println("Test Fizz = FAIL");
        }

        real = fizzBuzz.detect(5);
        expected = "Buzz";
        if (real.equals(expected)) {
            System.out.println("Test Buzz = Ok");
        } else {
            System.out.println("Test Buzz = FAIL");
        }

        real = fizzBuzz.detect(30);
        expected = "FizzBuzz";
        if (real.equals(expected)) {
            System.out.println("Test FizzBuzz = Ok");
        } else {
            System.out.println("Test FizzBuzz = FAIL");
        }

        real = fizzBuzz.detect(14);
        expected = "14";
        if (real.equals(expected)) {
            System.out.println("Test other = Ok");
        } else {
            System.out.println("Test other = FAIL");
        }
    }

    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.detecFizzBuzzTest();
    }
}
