package students.student_deniss_fiscevs.lesson04.level_3_junior;

import java.util.Scanner;

public class Task_10 {

    public static void main(String[] args) {

        System.out.println("Please, enter three numbers:");

        Scanner scanner = new Scanner(System.in);
        int userNumber1 = scanner.nextInt();

        System.out.println("Accepted! And the second number?");

        int userNumber2 = scanner.nextInt();

        System.out.println("One more to go! The third number?");

        int userNumber3 = scanner.nextInt();

        if (userNumber1 > userNumber2 && userNumber1 > userNumber3) {
            System.out.println("Biggest number is " + userNumber1);
        } else if (userNumber2 > userNumber1 && userNumber2 > userNumber3) {
            System.out.println("Biggest number is " + userNumber2);
        } else if (userNumber3 > userNumber1 && userNumber3 > userNumber2) {
            System.out.println("Biggest number is " + userNumber3);
        } else {
            System.out.println("All number are equal");
        }
    }

}
