package students.student_ignat_parfenov.lesson_6.homework.level_2_intern;

class DayOfTheWeekDetectorTest {

    public static void main(String[] args) {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        System.out.println(dayOfTheWeekDetector.findDayOfTheWeek(dayOfTheWeekDetector.getDayNumberFromUser()));
//        dayOfTheWeekDetector.findDayOfTheWeek(dayOfTheWeekDetector.getDayNumberFromUser());
        DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();
        test.shouldReturnMonday();
        test.shouldReturnTuesday();
        test.shouldReturnWednesday();
        test.shouldReturnThursday();
        test.shouldReturnFriday();
        test.shouldReturnSaturday();
        test.shouldReturnSunday();
    }

    String findDayOfTheWeekTest(int dayNumber) {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        return dayOfTheWeekDetector.findDayOfTheWeek(dayNumber);
    }

    public void shouldReturnMonday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(1);
        checkTestResult("Monday".equals(dayOfTheWeek), "Monday");
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }

    public void shouldReturnTuesday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(2);
        checkTestResult("Tuesday".equals(dayOfTheWeek), "Tuesday");
    }

    public void shouldReturnWednesday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(3);
        checkTestResult("Wednesday".equals(dayOfTheWeek), "Wednesday");
    }

    public void shouldReturnThursday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(4);
        checkTestResult("Tuesday".equals(dayOfTheWeek), "Tuesday");

    }
    public void shouldReturnFriday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(5);
        checkTestResult("Friday".equals(dayOfTheWeek), "Friday");
    }

    public void shouldReturnSaturday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(6);
        checkTestResult("Saturday".equals(dayOfTheWeek), "Saturday");
    }

    public void shouldReturnSunday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(6);
        checkTestResult("Sunday".equals(dayOfTheWeek), "Sunday");
    }
}


