package students.student_ilja_morozovs.lesson_4.homework.level_3.Task_9;

import java.util.Scanner;

class ThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number one: ");
        int userNumber1 = scanner.nextInt();
        System.out.println("Please enter number two: ");
        int userNumber2 = scanner.nextInt();
        System.out.println("Please enter number three: ");
        int userNumber3 = scanner.nextInt();
        if (userNumber1 < userNumber2 && userNumber1 < userNumber3 && userNumber2 < userNumber3) {
            System.out.println("increasing");
        } else if (userNumber1 > userNumber2 && userNumber1 > userNumber3 && userNumber2 > userNumber3) {
            System.out.println("decreasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
