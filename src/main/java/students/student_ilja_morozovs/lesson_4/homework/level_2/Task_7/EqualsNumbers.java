package students.student_ilja_morozovs.lesson_4.homework.level_2.Task_7;

import java.util.Scanner;

public class EqualsNumbers {
    public static void main(String[] args) {
        System.out.println("Please input number one: ");
        Scanner scanner = new Scanner(System.in);
        int userNumber1 = scanner.nextInt();
        System.out.println("Please input number two: ");
        int userNumber2 = scanner.nextInt();
        if (userNumber1 == userNumber2) {
            System.out.println("Numbers one is equal!!!");
        } else {
            System.out.println("Numbers are different");
        }
    }
}
