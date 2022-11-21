package students.student_svetlana_seda.lesson_6.homework.level_2;

class DayOfTheWeekDetectorTest {

    public static void main(String[] args) {

        DayOfTheWeekDetectorTest dayOfTheWeekDetectorTest = new DayOfTheWeekDetectorTest();
        dayOfTheWeekDetectorTest.shouldReturnMonday();
        dayOfTheWeekDetectorTest.shouldReturnTuesday();
        dayOfTheWeekDetectorTest.shouldReturnWednesday();
        dayOfTheWeekDetectorTest.shouldReturnThursday();
        dayOfTheWeekDetectorTest.shouldReturnFriday();
        dayOfTheWeekDetectorTest.shouldReturnSaturday();
        dayOfTheWeekDetectorTest.shouldReturnSunday();
        dayOfTheWeekDetectorTest.shouldReturnNotCorrectDayNumber();

    }

    void shouldReturnMonday() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();

        int dayNumber = 1;
        String expectedResult = "Monday";
        String realResult = dayOfTheWeekDetector.findDayOfTheWeek(dayNumber);

        if (expectedResult.equals(realResult)) {
            System.out.println("Test is OK");
        } else {
            System.out.println("Test is FAIL");
        }

    }

    void shouldReturnTuesday() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();

        int dayNumber = 2;
        String expectedResult = "Tuesday";
        String realResult = dayOfTheWeekDetector.findDayOfTheWeek(dayNumber);

        if (expectedResult.equals(realResult)) {
            System.out.println("Test is OK");
        } else {
            System.out.println("Test is FAIL");
        }

    }

    void shouldReturnWednesday() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();

        int dayNumber = 3;
        String expectedResult = "Wednesday";
        String realResult = dayOfTheWeekDetector.findDayOfTheWeek(dayNumber);

        if (expectedResult.equals(realResult)) {
            System.out.println("Test is OK");
        } else {
            System.out.println("Test is FAIL");
        }

    }

    void shouldReturnThursday() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();

        int dayNumber = 4;
        String expectedResult = "Thursday";
        String realResult = dayOfTheWeekDetector.findDayOfTheWeek(dayNumber);

        if (expectedResult.equals(realResult)) {
            System.out.println("Test is OK");
        } else {
            System.out.println("Test is FAIL");
        }

    }

    void shouldReturnFriday() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();

        int dayNumber = 5;
        String expectedResult = "Friday";
        String realResult = dayOfTheWeekDetector.findDayOfTheWeek(dayNumber);

        if (expectedResult.equals(realResult)) {
            System.out.println("Test is OK");
        } else {
            System.out.println("Test is FAIL");
        }

    }

    void shouldReturnSaturday() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();

        int dayNumber = 6;
        String expectedResult = "Saturday";
        String realResult = dayOfTheWeekDetector.findDayOfTheWeek(dayNumber);

        if (expectedResult.equals(realResult)) {
            System.out.println("Test is OK");
        } else {
            System.out.println("Test is FAIL");
        }

    }

    void shouldReturnSunday() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();

        int dayNumber = 7;
        String expectedResult = "Sunday";
        String realResult = dayOfTheWeekDetector.findDayOfTheWeek(dayNumber);

        if (expectedResult.equals(realResult)) {
            System.out.println("Test is OK");
        } else {
            System.out.println("Test is FAIL");
        }

    }

    void shouldReturnNotCorrectDayNumber() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();

        int dayNumber = 8;
        String expectedResult = "Incorrect number";
        String realResult = dayOfTheWeekDetector.findDayOfTheWeek(dayNumber);

        if (expectedResult.equals(realResult)) {
            System.out.println("Test is OK");
        } else {
            System.out.println("Test is FAIL");
        }

    }

}
