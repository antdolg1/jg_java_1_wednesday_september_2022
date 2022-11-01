package students.student_artjoms_trosihins.lesson_3_level_2;

import java.util.Scanner;

public class UserName {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Hello user! What's your name?");

        String name = sc.nextLine();
        System.out.println("Hello " + name + "!");
    }
}
