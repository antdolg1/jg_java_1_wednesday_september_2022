package students.student_dmitrijs_sockovs;

import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {

        int userNumber;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any number: ");
        userNumber = scanner.nextInt();
        System.out.println("-----------------------");
        System.out.println("User entered number: " + userNumber);
    }
}
