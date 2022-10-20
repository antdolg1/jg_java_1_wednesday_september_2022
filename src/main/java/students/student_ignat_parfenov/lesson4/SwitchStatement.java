package students.student_ignat_parfenov.lesson4;

import java.util.Scanner;

public class SwitchStatement {

    public static void main(String[] args) {

        System.out.println("Enter you level number: ");
        Scanner scanner = new Scanner(System.in);
        int level = scanner.nextInt();

        if (level == 1) {
            System.out.println("Intern");
        } else if (level == 2) {
            System.out.println("Junior");
        } else if (level == 3) {
            System.out.println("Middle");
        } else if (level == 4) {
            System.out.println("Senior");
        } else if (level == 5) {
            System.out.println("Architect");
        } else {
            System.out.println("CTO");
        }
    }
}


