package students.student_svetlana_seda.lesson_7.homework.level_5;

class PowerCalculator {

    public int powerNumber(int number, int degree) {
        int returnNumber = 1;
        for (int i = 0; i < degree; i++) {
            returnNumber *= number;
        }
        return returnNumber;
    }

}
