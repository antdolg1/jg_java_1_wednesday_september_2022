package students.student_mihhail_karasjov;

import java.util.Scanner;

public class ScannerDemo {


    public static void main(String[] args) {

        int userNumber;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any number: ");
        userNumber = scanner.nextInt();
        System.out.println("______________");

        System.out.println("User entered number: " + userNumber);

    }
}
