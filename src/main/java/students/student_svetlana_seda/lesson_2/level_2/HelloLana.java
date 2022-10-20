package students.student_svetlana_seda.lesson_2.level_2;

import java.util.Scanner;

public class HelloLana {
    public static void main(String[] args) {

        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your username: ");
        name = scanner.nextLine();
        System.out.println("HELLO, " + name + "!");

    }
}

