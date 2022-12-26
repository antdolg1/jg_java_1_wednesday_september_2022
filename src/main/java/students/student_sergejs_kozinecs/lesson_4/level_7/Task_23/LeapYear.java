package students.student_sergejs_kozinecs.lesson_4.level_7.Task_23;

class LeapYear {
    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
