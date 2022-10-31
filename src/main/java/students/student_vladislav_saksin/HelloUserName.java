package students.student_vladislav_saksin;

import java.util.Scanner;

public class HelloUserName {

    public static void main(String[] args) {

        String userName;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Your name: ");
        userName = scanner.nextLine();
        System.out.println("----------------------");
        System.out.println("Hello " + userName + "!");


    }
}
