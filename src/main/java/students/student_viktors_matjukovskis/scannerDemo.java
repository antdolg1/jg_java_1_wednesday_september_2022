package students.student_viktors_matjukovskis;

import java.util.Scanner;

public class scannerDemo {

    public static void main(String[] args) {

        int userNumber;

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter any number: ");
        userNumber = scanner.nextInt();
        System.out.println("----------------------");

        System.out.println("User entered number:" + userNumber);
    }
}
