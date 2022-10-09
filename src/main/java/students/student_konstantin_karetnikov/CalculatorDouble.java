package students.student_konstantin_karetnikov;
import java.util.Scanner;

public class CalculatorDouble {
    public static void main(String[] args) {

        double firstNumber;
        double secondNumber;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        firstNumber = scanner.nextDouble();
        System.out.println("Please enter second number: ");
        secondNumber = scanner.nextDouble();

        System.out.println("+ " + (firstNumber+secondNumber));
        System.out.println("- " + (firstNumber-secondNumber));
        System.out.println("* " + (firstNumber*secondNumber));
        System.out.println("/ " + (firstNumber/secondNumber));

    }
}
