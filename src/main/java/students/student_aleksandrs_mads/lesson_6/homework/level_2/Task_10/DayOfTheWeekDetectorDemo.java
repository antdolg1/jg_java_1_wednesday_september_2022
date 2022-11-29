package students.student_aleksandrs_mads.lesson_6.homework.level_2.Task_10;

class DayOfTheWeekDetectorDemo {
    public static void main(String[] args) {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        int numberFromUser = detector.getDateFromUser();
        System.out.println(detector.findDayNumber(numberFromUser));
    }
}



