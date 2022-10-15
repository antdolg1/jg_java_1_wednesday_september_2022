package students.student_stivens_veveris;

import java.util.Scanner;

public class Hello_Username {

    public static void main(String[] args) {

        String username1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your username: ");
        username1 = scanner.nextLine();
        System.out.println("---------------------------");
        System.out.println("HELLO, " + username1 + "!");

    }
}
