package students.student_ignat_parfenov.lesson_4.homework.level_7_senior;

public class FizzBuzz {

    public String detect(int number) {

        if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else if ((number % 3 != 1) && (number % 5 != 1)) {
            return "FizzBuzz";
        } else {
            return "number";
        }
    }
}
