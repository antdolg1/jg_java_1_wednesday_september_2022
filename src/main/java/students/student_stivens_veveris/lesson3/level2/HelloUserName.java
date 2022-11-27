package students.student_stivens_veveris.lesson3.level2;

import java.util.Scanner;

public class HelloUserName {

    public static void main(String[] args) {

        String userName;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter your username: ");

        userName = scanner.nextLine();
        System.out.println("-----------------------------");
        System.out.println("Hello " + userName + "!");

    }
}
