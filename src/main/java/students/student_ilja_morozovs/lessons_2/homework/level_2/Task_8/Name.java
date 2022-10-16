package students.student_ilja_morozovs.lessons_2.homework.level_2.Task_8;

import java.util.Scanner;

class Name {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String enterTheName = scanner.nextLine();
        System.out.println("Hello " + enterTheName);
    }
}
