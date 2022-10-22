package students.student_ilja_morozovs.lesson_4.homework.level_2.Task_6;

import java.util.Scanner;

class SmallNumber {
    public static void main(String[] args) {
        System.out.println("Please input number one: ");
        Scanner scanner = new Scanner(System.in);
        int userNumber1 = scanner.nextInt();
        System.out.println("Please input number two: ");
        int userNumber2 = scanner.nextInt();
        if (userNumber1 < userNumber2) {
            System.out.println("Number one is smaller!!!");
        } else if (userNumber2 < userNumber1) {
            System.out.println("Number two is smaller!!!");
        } else {
            System.out.println("Numbers are equals!!!");
        }
    }
}
