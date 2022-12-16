package students.student_deniss_fiscevs.lesson06.level_2_intern;

import java.util.Scanner;

class DayOfTheWeekDetector {

    public int getDayNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input day number between 1 and 7 : ");
        return scanner.nextInt();
    }

    public String findDayOfTheWeek(int dayNumber) {
        String dayOfWeek = switch (dayNumber) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Incorrect input";
        };
        return dayOfWeek;
    }
}