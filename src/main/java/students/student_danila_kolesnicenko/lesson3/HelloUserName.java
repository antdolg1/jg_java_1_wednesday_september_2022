package students.student_danila_kolesnicenko.lesson3;

import java.util.Scanner;

class HelloUserName {

    public static void main(String[] args) {

        System.out.println("What is your name? ");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        System.out.println("Hello! " + userName );

    }
}
