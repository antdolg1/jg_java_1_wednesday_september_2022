package students.student_jurij_hlebnikov.homework_leson_6;

public class DayOfTheWeekDetectorTest {

    public static void main(String[] args) {

        DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();
        test.shouldReturnMonday();
        test.shouldReturnTuesday();
        test.shouldReturnWednesday();
        test.shouldReturnThursday();
        test.shouldReturnFriday();
        test.shouldReturnSaturday();
        test.shouldReturnSunday();
        test.shouldReturnError();

    }

    public void shouldReturnMonday() {
        DayOfTheWeekDetector testDetector = new DayOfTheWeekDetector();
        String day = testDetector.findDayOfTheWeek(1);
        boolean result = "Monday".equals(day);
        checkTestResult(result, "Day Monday Test: ");
    }

    public void shouldReturnTuesday() {
        DayOfTheWeekDetector testDetector = new DayOfTheWeekDetector();
        String day = testDetector.findDayOfTheWeek(2);
        boolean result = "Tuesday".equals(day);
        checkTestResult(result, "Day Tuesday Test: ");
    }

    public void shouldReturnWednesday() {
        DayOfTheWeekDetector testDetector = new DayOfTheWeekDetector();
        String day = testDetector.findDayOfTheWeek(3);
        boolean result = "Wednesday".equals(day);
        checkTestResult(result, "Day Wednesday Test: ");
    }


    public void shouldReturnThursday() {
        DayOfTheWeekDetector testDetector = new DayOfTheWeekDetector();
        String day = testDetector.findDayOfTheWeek(4);
        boolean result = "Thursday".equals(day);
        checkTestResult(result, "Day Thursday Test: ");
    }

    public void shouldReturnFriday() {
        DayOfTheWeekDetector testDetector = new DayOfTheWeekDetector();
        String day = testDetector.findDayOfTheWeek(5);
        boolean result = "Friday".equals(day);
        checkTestResult(result, "Day Friday Test: ");
    }

    public void shouldReturnSaturday() {
        DayOfTheWeekDetector testDetector = new DayOfTheWeekDetector();
        String day = testDetector.findDayOfTheWeek(6);
        boolean result = "Saturday".equals(day);
        checkTestResult(result, "Day Saturday Test: ");
    }

    public void shouldReturnSunday() {
        DayOfTheWeekDetector testDetector = new DayOfTheWeekDetector();
        String day = testDetector.findDayOfTheWeek(7);
        boolean result = "Sunday".equals(day);
        checkTestResult(result, "Day Sunday Test: ");
    }

    public void shouldReturnError() {
        DayOfTheWeekDetector testDetector = new DayOfTheWeekDetector();
        String day = testDetector.findDayOfTheWeek(9);
        boolean result = "Not correct day number".equals(day);
        checkTestResult(result, "Not correct day number: ");
    }


    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + "OK!");
        } else {
            System.out.println(testName + "FAIL!");
        }
    }
}
