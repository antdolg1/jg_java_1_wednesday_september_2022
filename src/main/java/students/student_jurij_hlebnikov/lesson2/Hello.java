package students.student_jurij_hlebnikov.lesson2;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter Your Name:");

        String scan = scanner.nextLine();

        System.out.println("Hello " + scan);
    }
}
