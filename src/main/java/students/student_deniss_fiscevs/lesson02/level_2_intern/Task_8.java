package students.student_deniss_fiscevs.lesson02.level_2_intern;

import java.util.Scanner;

public class Task_8 {

    public static void main(String[] args) {

        System.out.println("What is your name, stranger?");

        Scanner myscanner = new Scanner(System.in);
        String userName = myscanner.next();
        System.out.println("________________");

        System.out.println("Hello, " + userName + "!");

    }
}
