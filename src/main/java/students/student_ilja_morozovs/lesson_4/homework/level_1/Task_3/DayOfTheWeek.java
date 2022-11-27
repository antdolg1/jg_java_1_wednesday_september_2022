package students.student_ilja_morozovs.lesson_4.homework.level_1.Task_3;

import java.util.Scanner;

class DayOfTheWeek {
    public static void main(String[] args) {
        int dayWeekNumber;
        System.out.println("Please enter the day week number: ");
        Scanner scanner = new Scanner(System.in);
        dayWeekNumber = scanner.nextInt();
        switch (dayWeekNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
            default:
                System.out.println("You entered the wrong number.");
        }
    }
}
