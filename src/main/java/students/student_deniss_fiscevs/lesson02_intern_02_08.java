package students.student_deniss_fiscevs;

import java.util.Scanner;

public class lesson02_intern_02_08 {

    public static void main(String[] args) {

        System.out.println("What is your name, stranger?");

        Scanner myscanner = new Scanner(System.in);
        String userName = myscanner.next();
        System.out.println("________________");

        System.out.println("Hello, " + userName + "!");

    }
}
