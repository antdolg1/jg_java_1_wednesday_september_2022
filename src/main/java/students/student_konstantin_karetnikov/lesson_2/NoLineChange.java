package students.student_konstantin_karetnikov.lesson_2;
import java.util.Scanner;
public class NoLineChange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter text in this line, without change to the next line: ");
            scanner.nextLine();
            System.out.println("It's working!");
        }
}
