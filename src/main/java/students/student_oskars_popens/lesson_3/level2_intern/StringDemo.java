package students.student_oskars_popens.lesson_3.level2_intern;

import java.util.Scanner;

// Task_7 && Task_8 && Task_9
class StringDemo {
    public static void main(String[] args) {
        String myName = "Oskars";
        String greetings = "Hi " + myName + "!";

        Scanner scanner = new Scanner(System.in);
        String yourName;

        System.out.println(myName);
        System.out.println(greetings);
        System.out.println("====================================");

        System.out.print("Please enter Your name:");
        yourName = scanner.nextLine();

        System.out.println("Hello " + yourName);

    }
}
