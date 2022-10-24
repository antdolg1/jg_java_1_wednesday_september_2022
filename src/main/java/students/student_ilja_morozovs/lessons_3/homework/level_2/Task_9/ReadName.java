package students.student_ilja_morozovs.lessons_3.homework.level_2.Task_9;

import java.util.Scanner;

class ReadName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please set your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello! " + name + "!");
    }
}
