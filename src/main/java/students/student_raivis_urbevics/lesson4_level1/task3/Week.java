package students.student_raivis_urbevics.lesson4_level1.task3;

import java.util.Scanner;

class Week {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberDay = scanner.nextInt();
        switch (numberDay) {
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
        }
    }
}

