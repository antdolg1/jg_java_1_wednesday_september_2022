package students.student_danila_kolesnicenko;

import java.util.Scanner;

public class userName {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String userName;

        System.out.println("Please enter your name.");
        userName = scanner.nextLine();
        System.out.println("Hello " + userName + "!");


    }
}
