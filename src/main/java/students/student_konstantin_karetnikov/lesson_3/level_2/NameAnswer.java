package students.student_konstantin_karetnikov.lesson_3.level_2;

import java.util.Scanner;

class NameAnswer {
    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.println("Hello " + userName + "!");


    }
}
