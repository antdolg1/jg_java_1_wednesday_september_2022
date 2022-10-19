package students.student_danila_kolesnicenko;

import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {

        int userNumber;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any number: ");
        userNumber = scanner.nextInt();
        System.out.println("___________");

        System.out.println("User entered number: " + userNumber);


    }
}
