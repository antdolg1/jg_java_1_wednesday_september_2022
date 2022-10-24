package students.student_oskars_popens.lesson_4.level_4_junior;

class Calculator {

    int sum(int number1, int number2) {
        return number1 + number2;
    }

    int minus(int number1, int number2) {
        return number1 - number2;
    }

    int divide(int number1, int number2) {
        return number1 / number2;
    }

    int multiply(int number1, int number2) {
        return number1 * number2;
    }

    boolean isEven(int number) {
        if (0 == (number % 2)) {
            return true;
        } else {
            return false;
        }
    }

    int getMax(int number1, int number2) {
        if (number1 > number2) {
            return number1;
        } else if (number2 > number1) {
            return number2;
        } else {
            return number1;
        }
    }

    int getMaxOfThree(int number1, int number2, int number3){
        if (number1 >= number2 && number1 > number3){
            return number1;
        } else if (number2 > number3 && number2 > number1) {
            return number2;
        } else {
            return number3;
        }
    }
}
