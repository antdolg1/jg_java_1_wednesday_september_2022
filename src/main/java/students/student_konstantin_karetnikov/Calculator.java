package students.student_konstantin_karetnikov;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {

        int firstNumber;
        int secondNumber;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        firstNumber = scanner.nextInt();
        System.out.println("Please enter second number: ");
        secondNumber = scanner.nextInt();

        System.out.println("+ " + (firstNumber+secondNumber));
        System.out.println("- " + (firstNumber-secondNumber));
        System.out.println("* " + (firstNumber*secondNumber));
        System.out.println("/ " + (firstNumber/secondNumber));

    }
}
