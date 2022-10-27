package students.student_ilja_morozovs.lesson_5.homework.level_2.Task_11;

import java.util.Scanner;

class UserNumberArray {

    public static void main(String[] args) {
        int[] numbersArray = new int[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the numbers: ");
        numbersArray[0] = scanner.nextInt();
        numbersArray[1] = scanner.nextInt();
        numbersArray[2] = scanner.nextInt();
        System.out.println("You enter this numbers: ");
        for (int userNumbers : numbersArray) {
            System.out.println(userNumbers);
        }
    }
}

