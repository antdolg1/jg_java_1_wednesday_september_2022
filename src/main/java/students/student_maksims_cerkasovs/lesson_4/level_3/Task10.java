package students.student_maksims_cerkasovs.lesson_4.level_3;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first number: ");
        int userNumber1 = scanner.nextInt();
        System.out.println("Input the second number: ");
        int userNumber2 = scanner.nextInt();
        System.out.println("Input the third number: ");
        int userNumber3 = scanner.nextInt();

    //  1 2 3
    //  1 3 2
    //  3 1 2   vozmoznie varianti
    //  3 2 1
    //  2 3 1
    //  2 1 3

        if ((userNumber1 < userNumber2) && (userNumber2 < userNumber3)) {
            System.out.println(userNumber3);
        } else if ((userNumber1 < userNumber3) && (userNumber2 > userNumber3)) {
            System.out.println(userNumber2);
        } else if ((userNumber1 > userNumber3) && (userNumber2 < userNumber3)) {
            System.out.println(userNumber1);
        } else if ((userNumber1 > userNumber2) && (userNumber2 > userNumber3)) {
            System.out.println(userNumber1);
        } else if ((userNumber1 < userNumber2) && (userNumber3 < userNumber1)) {
            System.out.println(userNumber2);
        } else if ((userNumber1 < userNumber3) && (userNumber2 < userNumber1)) {
            System.out.println(userNumber3);
        }
    }
}

