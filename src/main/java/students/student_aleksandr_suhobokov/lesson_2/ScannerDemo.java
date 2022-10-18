package students.student_aleksandr_suhobokov.lesson_2;

import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {

        int userNumber;

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please enter any number: ");
        userNumber = scanner.nextInt();
        System.out.println(" __________");

        System.out.println(" User enterned number:" + userNumber);
    }
}
