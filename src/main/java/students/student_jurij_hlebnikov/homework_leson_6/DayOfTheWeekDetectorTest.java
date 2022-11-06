package students.student_jurij_hlebnikov.homework_leson_6;

public class DayOfTheWeekDetectorTest {

    public static void main(String[] args) {

        DayOfTheWeekDetector testDetector = new DayOfTheWeekDetector();
        String day = testDetector.findDayOfTheWeek(1);
        if ("Monday".equals(day)) {
            System.out.println("Day Monday Test: OK");
        } else {
            System.out.println("Day Monday Test: FAIL");
        }

        day = testDetector.findDayOfTheWeek(2);
        if ("Tuesday".equals(day)) {
            System.out.println("Day Tuesday Test: OK");
        } else {
            System.out.println("Day Tuesday Test: FAIL");
        }

        day = testDetector.findDayOfTheWeek(3);
        if ("Wednesday".equals(day)) {
            System.out.println("Day Wednesday Test: OK");
        } else {
            System.out.println("Day Wednesday Test: FAIL");
        }

        day = testDetector.findDayOfTheWeek(4);
        if ("Thursday".equals(day)) {
            System.out.println("Day Thursday Test: OK");
        } else {
            System.out.println("Day Thursday Test: FAIL");
        }

        day = testDetector.findDayOfTheWeek(5);
        if ("Friday".equals(day)) {
            System.out.println("Day Friday Test: OK");
        } else {
            System.out.println("Day Friday Test: FAIL");
        }

        day = testDetector.findDayOfTheWeek(6);
        if ("Saturday".equals(day)) {
            System.out.println("Day Saturday Test: OK");
        } else {
            System.out.println("Day Saturday Test: FAIL");
        }

        day = testDetector.findDayOfTheWeek(7);
        if ("Sunday".equals(day)) {
            System.out.println("Day Sunday Test: OK");
        } else {
            System.out.println("Day Sunday Test: FAIL");
        }

        day = testDetector.findDayOfTheWeek(129);
        if ("Not correct day number".equals(day)) {
            System.out.println("Not correct day number Test: OK");
        } else {
            System.out.println("Not correct day number Test: FAIL");
        }
    }
}
