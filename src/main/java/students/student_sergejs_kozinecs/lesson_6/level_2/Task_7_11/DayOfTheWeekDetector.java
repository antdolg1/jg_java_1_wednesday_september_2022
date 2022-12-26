package students.student_sergejs_kozinecs.lesson_6.level_2.Task_7_11;

import java.util.Scanner;

public class DayOfTheWeekDetector {
    public int getDayNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input day number between 1 and 7 : ");
        int dayNumber = scanner.nextInt();
        scanner.close();

        return dayNumber;
    }

    public String findDayOfTheWeek(int dayNumber) {
        String nameOfDay;
        switch (dayNumber) {
            case 1 -> nameOfDay = ("Monday");
            case 2 -> nameOfDay = ("Tuesday");
            case 3 -> nameOfDay = ("Wednesday");
            case 4 -> nameOfDay = ("Thursday");
            case 5 -> nameOfDay = ("Friday");
            case 6 -> nameOfDay = ("Saturday");
            case 7 -> nameOfDay = ("Sunday");
            default -> nameOfDay = ("Not correct day number");
        }
        return nameOfDay;
    }
}
