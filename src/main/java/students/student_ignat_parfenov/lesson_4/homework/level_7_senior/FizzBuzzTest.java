package students.student_ignat_parfenov.lesson_4.homework.level_7_senior;

public class FizzBuzzTest {

    public static void main(String[] args) {

        FizzBuzzTest test = new FizzBuzzTest();
        test.FizzBuzzTestIsDivisibleByThree();
        test.FizzBuzzTestIfDivisibleByFive();

    }

    void FizzBuzzTestIsDivisibleByThree() {

        FizzBuzz victim = new FizzBuzz();
        int number = 5;
        String expectedResult = "Fizz";
        String actualResult = victim.detect(number);

        if (expectedResult.equals(actualResult)) {
            System.out.println("Fizz! The number iz divisible by 3!");
        } else {
            System.out.println("Test is FAILED");
        }
    }

    void FizzBuzzTestIfDivisibleByFive() {

        FizzBuzz victim = new FizzBuzz();
        int number = 5;
        String expectedResult = "Buzz";
        String actualResult = victim.detect(number);

        if (expectedResult.equals(actualResult)) {
            System.out.println("Buzz! The number is divisible by 5!");
        }   else {
            System.out.println("Test is FAILED");
        }
    }
}
