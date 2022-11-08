package students.student_ilja_morozovs.lesson_4.homework.level_7.Task_22;

class FizzBuzz {
    String detect(int number) {
        int divisionOnThree = number % 3;
        int divisionOnFive = number % 5;
        if (divisionOnThree == 0 && divisionOnFive == 0) {
            return "FizzBuzz";
        } else if (divisionOnFive == 0) {
            return "Buzz";
        } else if (divisionOnThree == 0) {
            return "Fizz";
        }
        return "" + number;
    }
}
