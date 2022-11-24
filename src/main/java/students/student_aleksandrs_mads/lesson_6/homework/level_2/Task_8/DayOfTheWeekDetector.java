package students.student_aleksandrs_mads.lesson_6.homework.level_2.Task_8;

import java.util.Scanner;

class DayOfTheWeekDetector {
    public static void main(String[] args) {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        System.out.println(dayOfTheWeekDetector.dayNumber(dayOfTheWeekDetector.dateFromUser()));
    }

    int dateFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Intput day number between 1 and 7 :");
        return scanner.nextInt();
    }

    String dayNumber(int dayNumberFromUser) {
        String dayName;
        switch (dayNumberFromUser) {
            case 1 -> dayName = "Monday";
            case 2 -> dayName = "Tuesday";
            case 3 -> dayName = ("Wednesday");
            case 4 -> dayName = ("Thursday");
            case 5 -> dayName = ("Friday");
            case 6 -> dayName = ("Saturday");
            case 7 -> dayName = ("Sunday");
            default -> dayName = ("Not correct day number");
        }
        return dayName;
    }
}

