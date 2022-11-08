package students.student_artjoms_trosihins.lesson_2.level_2;

import java.util.Scanner;

class HelloUser {
    public static void main(String[] args) {
        String username;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello! What's your name?");
        username = sc.nextLine();
        System.out.println("Hello " + username);
    }
}
