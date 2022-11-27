package students.student_maksims_cerkasovs.lesson_4.level_2;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first number: ");
        int userNumber1 = scanner.nextInt();
        System.out.println("Input the second number: ");
        int userNumber2 = scanner.nextInt();

        if (userNumber1 == userNumber2) {
            System.out.println("Numbers are equals");
        } else {
            System.out.println("Numbers are different");
        }
    }
}
