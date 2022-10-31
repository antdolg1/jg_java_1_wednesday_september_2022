package students.student_svetlana_seda.lesson_4.level_7;

class FizzBuzz {

    String detect(int number) {
        if (0 == number % 3) {
            if (0 == number % 5) {
                return "FizzBuzz";
            } else {
                return "Fizz";
            }
        } else if (0 == number % 5) {
            return "Buzz";
        }
        return "" + number;
    }

}
