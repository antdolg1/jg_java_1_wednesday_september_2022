package students.student_konstantin_karetnikov;

import java.util.Scanner;

public class NoLineChange {

    private static java.lang.String String;

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter text in this line, without change to the next line: ");
            String = scanner.nextLine();

            System.out.println("It's working!");
        }
    

}
