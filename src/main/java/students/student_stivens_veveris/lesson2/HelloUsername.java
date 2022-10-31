package students.student_stivens_veveris.lesson2;

import java.util.Scanner;

public class HelloUsername {

    public static void main(String[] args) {

        String username1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your username: ");
        username1 = scanner.nextLine();
        System.out.println("---------------------------");
        System.out.println("HELLO, " + username1 + "!");

    }
}
