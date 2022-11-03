package students.student_ilja_morozovs.lesson_6.homework.level_2.Task_7;

public class DayOfTheWeekDetectorDemoTest {

    public static void main(String[] args) {
        DayOfTheWeekDetectorDemoTest dayOfTheWeekDetectorDemoTest = new DayOfTheWeekDetectorDemoTest();
        dayOfTheWeekDetectorDemoTest.dayNumberConditionTest(dayOfTheWeekDetectorDemoTest.getDayNumberFromUserTest());
        dayOfTheWeekDetectorDemoTest.dayNumberConditionTest(dayOfTheWeekDetectorDemoTest.findDayNameTest(2).
                equals("Tuesday"));
    }

    void dayNumberConditionTest(boolean condition) {
        if (condition) {
            System.out.println("Test is: OK");
        } else {
            System.out.println("Test is: FAIL");
        }
    }

    boolean getDayNumberFromUserTest() {
        DayOfTheWeekDetectorDemo dayOfTheWeekDetectorDemo = new DayOfTheWeekDetectorDemo();
        int realDateResult = dayOfTheWeekDetectorDemo.getDayNumberFromUser();
        return realDateResult >= 1 && realDateResult <= 7;
    }

    String findDayNameTest(int dayNumber) {
        DayOfTheWeekDetectorDemo dayOfTheWeekDetectorDemo = new DayOfTheWeekDetectorDemo();
        return dayOfTheWeekDetectorDemo.findDayName(dayNumber);
    }
}
