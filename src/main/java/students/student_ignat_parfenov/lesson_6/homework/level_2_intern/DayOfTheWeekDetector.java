package students.student_ignat_parfenov.lesson_6.homework.level_2_intern;

import java.util.Scanner;

class DayOfTheWeekDetector {

    public int getDayNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input day number between 1 and 7 : ");
        return scanner.nextInt();

    }

    public String findDayOfTheWeek(int dayNumber) {

        String dayName;
        switch (dayNumber) {
            case 1 -> dayName = ("Monday");
            case 2 -> dayName = ("Tuesday");
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
