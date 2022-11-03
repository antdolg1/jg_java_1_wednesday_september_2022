package students.student_ilja_morozovs.lesson_6.homework.level_2.Task_7;

import java.util.Scanner;

class DayOfTheWeekDetectorDemo {
    public static void main(String[] args) {
        DayOfTheWeekDetectorDemo dayOfTheWeekDetectorDemo = new DayOfTheWeekDetectorDemo();
        System.out.println(dayOfTheWeekDetectorDemo.findDayName(dayOfTheWeekDetectorDemo.getDayNumberFromUser()));
    }

    int getDayNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input day number between 1 and 7 : ");
        return scanner.nextInt();
    }

    String findDayName(int dayNumber) {
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
