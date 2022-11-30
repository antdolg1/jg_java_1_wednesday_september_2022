package students.student_viktors_matjukovskis.lesson3;

import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = in.nextLine();
        System.out.printf("Hello: %s  \n", name);
        in.close();

    }
}
