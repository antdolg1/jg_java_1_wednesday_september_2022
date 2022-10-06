package students.student_ilja_morozovs.lessons2.level2;

import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String enterTheName=scanner.nextLine();
        System.out.println("Hello "+enterTheName);
    }
}
