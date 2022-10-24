package students.student_oskars_popens.lesson_4.level_1_intern;

import java.util.Scanner;

class WeekDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weekDay;

        System.out.println("Please enter integer number from 1 to 7:");
        weekDay = sc.nextInt();

        switch (weekDay) {
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
                break;
            default:
                System.out.println("Wrong number entered");
        }
    }
}
