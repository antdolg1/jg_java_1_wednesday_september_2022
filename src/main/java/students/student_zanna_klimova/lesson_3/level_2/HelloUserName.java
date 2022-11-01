package students.student_zanna_klimova.lesson_3.level_2;

import java.util.Scanner;


 class HelloUserName {
     static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");

        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
