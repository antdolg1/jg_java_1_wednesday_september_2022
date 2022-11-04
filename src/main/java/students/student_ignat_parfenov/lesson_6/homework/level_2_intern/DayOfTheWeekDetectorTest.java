package students.student_ignat_parfenov.lesson_6.homework.level_2_intern;

class DayOfTheWeekDetectorTest {

    public static void main(String[] args) {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        System.out.println(dayOfTheWeekDetector.findDayOfTheWeek(dayOfTheWeekDetector.getDayNumberFromUser()));
//        dayOfTheWeekDetector.findDayOfTheWeek(dayOfTheWeekDetector.getDayNumberFromUser());
        DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();
        test.shouldReturnMonday();
    }

    String findDayOfTheWeekTest(int dayNumber) {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        return dayOfTheWeekDetector.findDayOfTheWeek(dayNumber);
    }

    public void shouldReturnMonday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(2);
        checkTestResult("Monday".equals(dayOfTheWeek), "Tuesday");
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}