package students.student_ignat_parfenov.lesson_6.homework.level_2_intern;

class DayOfTheWeekDetectorTest {

    public static void main(String[] args) {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        System.out.println(dayOfTheWeekDetector.findDayOfTheWeek(dayOfTheWeekDetector.getDayNumberFromUser()));
//        dayOfTheWeekDetector.findDayOfTheWeek(dayOfTheWeekDetector.getDayNumberFromUser());
    }

    String findDayOfTheWeekTest(int dayNumber) {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        return dayOfTheWeekDetector.findDayOfTheWeek(dayNumber);
    }
}