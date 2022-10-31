package students.student_svetlana_seda.lesson_4.level_7;

class LeapYear {

    boolean isLeapYear(int year) {
        if (0 == year % 4) {
            if (0 == year % 100) {
                if (0 == year % 400) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

}
