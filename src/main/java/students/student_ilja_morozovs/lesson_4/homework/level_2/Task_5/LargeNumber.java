package students.student_ilja_morozovs.lesson_4.homework.level_2.Task_5;

import java.util.Scanner;

class LargeNumber {
    public static void main(String[] args) {
        System.out.println("Please input number one: ");
        Scanner scanner = new Scanner(System.in);
        int userNumber1 = scanner.nextInt();
        System.out.println("Please input number two: ");
        int userNumber2 = scanner.nextInt();
        if (userNumber1 > userNumber2) {
            System.out.println("Number one is bigger number two!!!");
        } else if (userNumber2 > userNumber1) {
            System.out.println("Number two is bigger number one!!!");
        } else {
            System.out.println("Number are equal");
        }
    }
}
