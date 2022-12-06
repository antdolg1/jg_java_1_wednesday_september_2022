package students.student_maksims_cerkasovs.lesson_4.level_3;

import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first number: ");
        int userNumber1 = scanner.nextInt();
        System.out.println("Input the second number: ");
        int userNumber2 = scanner.nextInt();
        System.out.println("Input the third number: ");
        int userNumber3 = scanner.nextInt();


        if ((userNumber1 == userNumber2) && (userNumber2 == userNumber3)) {
            System.out.println("All numbers are equal");
        } else if ((userNumber1 != userNumber2) && (userNumber2 != userNumber3) && (userNumber1 != userNumber3)) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
