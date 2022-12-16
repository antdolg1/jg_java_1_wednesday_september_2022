package students.student_deniss_fiscevs.lesson06.level_2_intern;

class DayOfTheWeekDetectorTest {

    public static void main(String[] args) {

        DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();
        test.shouldClassifyMonday();
        test.shouldClassifyTuesday();
        test.shouldClassifyWednesday();
        test.shouldClassifyThursday();
        test.shouldClassifyFriday();
        test.shouldClassifySaturday();
        test.shouldClassifySunday();
        test.shouldClassifyIncorrectInput();

    }

    void shouldClassifyMonday() {
        DayOfTheWeekDetector vitim = new DayOfTheWeekDetector();

        int dayNumber = 1;
        String expectedResult = "Monday";
        String actualResult = vitim.findDayOfTheWeek(dayNumber);
        {
            if (expectedResult.equals(actualResult)) {
                System.out.println("Test = OK");
            } else {
                System.out.println("Test = FAIL");
            }
        }
    }

    void shouldClassifyTuesday() {
        DayOfTheWeekDetector vitim = new DayOfTheWeekDetector();

        int dayNumber = 2;
        String expectedResult = "Tuesday";
        String actualResult = vitim.findDayOfTheWeek(dayNumber);
        {
            if (expectedResult.equals(actualResult)) {
                System.out.println("Test = OK");
            } else {
                System.out.println("Test = FAIL");
            }
        }
    }

    void shouldClassifyWednesday() {
        DayOfTheWeekDetector vitim = new DayOfTheWeekDetector();

        int dayNumber = 3;
        String expectedResult = "Wednesday";
        String actualResult = vitim.findDayOfTheWeek(dayNumber);
        {
            if (expectedResult.equals(actualResult)) {
                System.out.println("Test = OK");
            } else {
                System.out.println("Test = FAIL");
            }
        }
    }

    void shouldClassifyThursday() {
        DayOfTheWeekDetector vitim = new DayOfTheWeekDetector();

        int dayNumber = 4;
        String expectedResult = "Thursday";
        String actualResult = vitim.findDayOfTheWeek(dayNumber);
        {
            if (expectedResult.equals(actualResult)) {
                System.out.println("Test = OK");
            } else {
                System.out.println("Test = FAIL");
            }
        }
    }

    void shouldClassifyFriday() {
        DayOfTheWeekDetector vitim = new DayOfTheWeekDetector();

        int dayNumber = 5;
        String expectedResult = "Friday";
        String actualResult = vitim.findDayOfTheWeek(dayNumber);
        {
            if (expectedResult.equals(actualResult)) {
                System.out.println("Test = OK");
            } else {
                System.out.println("Test = FAIL");
            }
        }
    }

    void shouldClassifySaturday() {
        DayOfTheWeekDetector vitim = new DayOfTheWeekDetector();

        int dayNumber = 6;
        String expectedResult = "Saturday";
        String actualResult = vitim.findDayOfTheWeek(dayNumber);
        {
            if (expectedResult.equals(actualResult)) {
                System.out.println("Test = OK");
            } else {
                System.out.println("Test = FAIL");
            }
        }
    }

    void shouldClassifySunday() {
        DayOfTheWeekDetector vitim = new DayOfTheWeekDetector();

        int dayNumber = 7;
        String expectedResult = "Sunday";
        String actualResult = vitim.findDayOfTheWeek(dayNumber);
        {
            if (expectedResult.equals(actualResult)) {
                System.out.println("Test = OK");
            } else {
                System.out.println("Test = FAIL");
            }
        }
    }

    void shouldClassifyIncorrectInput() {
        DayOfTheWeekDetector vitim = new DayOfTheWeekDetector();

        int dayNumber = 8;
        String expectedResult = "Incorrect input";
        String actualResult = vitim.findDayOfTheWeek(dayNumber);
        {
            if (expectedResult.equals(actualResult)) {
                System.out.println("Test = OK");
            } else {
                System.out.println("Test = FAIL");
            }
        }
    }

}