package students.student_ignat_parfenov.lesson_6.homework.level_2_intern;

class DayOfTheWeekDetectorTest {

    public static void main(String[] args) {
        DayOfTheWeekDetector dayOfTheWeekDetectorTest = new DayOfTheWeekDetector();


    }

    void findDayOfTheWeek(boolean condition) {
        if (condition) {
            System.out.println("Test is DONE");
        } else {
            System.out.println("Test is FAILED");
        }
    }
    boolean getDayNumberFromUserTest() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        int realDateResult = dayOfTheWeekDetector.getDayNumberFromUser();
        return realDateResult >= 1 && realDateResult <= 7;
    }
}
