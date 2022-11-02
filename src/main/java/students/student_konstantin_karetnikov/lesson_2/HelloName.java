package students.student_konstantin_karetnikov.lesson_2;

import java.util.Scanner;

public class HelloName {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Hello " + name + "!");
    }
}
