package students.student_aleksandrs_mads.lesson_6.homework.level_2.Task_7;

import java.util.Scanner;

class DayOfTheWeekDetectorDemo {
    public static void main(String[] args) {
        DayOfTheWeekDetectorDemo dayOfTheWeekDetectorDemo=new DayOfTheWeekDetectorDemo();
        dayOfTheWeekDetectorDemo.findDayNumber(dayOfTheWeekDetectorDemo.getDateFromUser());
    }

    int getDateFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Intput day number between 1 and 7 :");
        return scanner.nextInt();
    }

    void findDayNumber(int dayNumberFromUser) {
        switch (dayNumberFromUser) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Not correct day number");
        }
    }
}

