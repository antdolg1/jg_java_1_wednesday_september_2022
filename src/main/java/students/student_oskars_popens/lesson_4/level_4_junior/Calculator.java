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
        if (number % 2 == 0){
            return true;
        } else{
            return false;
        }
    }

    int getMax(int number1, int number2) {
        if (number1 >= number2) {
            return number1;
        } else {
            return number2;
        }
    }

    int getMaxOfThree(int number1, int number2, int number3) {
        int max = getMax(number1, number2);

        if (number3 >= max) {
            return number3;
        } else {
            return max;
        }
    }
}
