package students.student_oskars_popens.lesson_4.level_7_senior;

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
