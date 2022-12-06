package students.student_oskars_popens.lesson_4.level_7_senior;

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
