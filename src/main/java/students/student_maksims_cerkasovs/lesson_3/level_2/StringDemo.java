package students.student_maksims_cerkasovs.lesson_3.level_2;

import java.util.Scanner;

public class StringDemo {

    public static void main(String[] args) {

        String myName = "Maksims";
        System.out.println(myName);

        String greeting = "Hi " + myName + "!";
        System.out.println(greeting);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the your name: ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");

    }
}