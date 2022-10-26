package students.student_sergejs_kozinecs.lesson_4.level_7.Task_23;

public class LeapYearTest {
    public static void main(String[] args) {
        LeapYearTest leapYearTest = new LeapYearTest();
        leapYearTest.divideByFourHunredFalseTest();
        leapYearTest.divideByFourHunredTest();
        leapYearTest.divideByFourTest();
    }

    void divideByFourTest() {
        LeapYear leapYear = new LeapYear();
        int year = 2024;
        boolean expectedResult = true;

        if (leapYear.isLeapYear(year) == expectedResult) {
            System.out.println("Divide by four test OK");
        } else {
            System.out.println("Divide by four test FALSE");
        }
    }

    void divideByFourHunredTest() {
        LeapYear leapYear = new LeapYear();
        int year = 2000;
        boolean expectedResult = true;

        if (leapYear.isLeapYear(year) == expectedResult) {
            System.out.println("Divide by 400 test OK");
        } else {
            System.out.println("Divide by 400 test FALSE");
        }
    }

    void divideByFourHunredFalseTest() {
        LeapYear leapYear = new LeapYear();
        int year = 1900;
        boolean expectedResult = false;

        if (leapYear.isLeapYear(year) == expectedResult) {
            System.out.println("Divide by 400 false test OK");
        } else {
            System.out.println("Divide by 400 false test FALSE");
        }
    }
}
