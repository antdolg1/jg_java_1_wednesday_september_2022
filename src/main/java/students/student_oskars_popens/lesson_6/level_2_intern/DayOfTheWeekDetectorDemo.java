package students.student_oskars_popens.lesson_6.level_2_intern;

class DayOfTheWeekDetectorDemo {
    public static void main(String[] args) {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        int dayNumber = detector.getDayNumberFromUser();
        String dayOfTheWeek = detector.findDayOfTheWeek((dayNumber));
        System.out.println(dayOfTheWeek);
    }
}
