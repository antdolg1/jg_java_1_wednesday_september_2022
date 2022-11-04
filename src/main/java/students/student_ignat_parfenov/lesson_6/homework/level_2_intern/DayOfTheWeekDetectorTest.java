package students.student_ignat_parfenov.lesson_6.homework.level_2_intern;

class DayOfTheWeekDetectorTest {

    public static void main(String[] args) {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        dayOfTheWeekDetector.findDayOfTheWeek(dayOfTheWeekDetector.getDayNumberFromUser());

    }

    boolean getDayNumberFromUserTest() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        int realDateResult = dayOfTheWeekDetector.getDayNumberFromUser();
        return realDateResult >= 1 && realDateResult <= 7;
    }
    String findDayNameTest(int dayNumber) {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        return dayOfTheWeekDetector.findDayOfTheWeek(dayNumber);
    }
}