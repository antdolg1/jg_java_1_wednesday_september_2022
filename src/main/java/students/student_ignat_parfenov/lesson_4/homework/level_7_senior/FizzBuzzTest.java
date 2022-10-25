package students.student_ignat_parfenov.lesson_4.homework.level_7_senior;

public class FizzBuzzTest {

    public static void main(String[] args) {

        FizzBuzzTest test = new FizzBuzzTest();
        test.FizzBuzzTestIsDivisionByThree();

    }

            void FizzBuzzTestIsDivisionByThree() {

            FizzBuzz victim = new FizzBuzz();
            int number = 12;
            String expectedResult = "Fizz";

            String actualResult = victim.detect(number);

            if (expectedResult.equals(actualResult)) {
                System.out.println("Fizz!");
            } else {
                System.out.println("Test is FAILED");
            }
        }
    }
