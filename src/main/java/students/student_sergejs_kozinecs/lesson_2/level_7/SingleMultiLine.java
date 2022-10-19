package students.student_sergejs_kozinecs.lesson_2.level_7;

import java.util.Scanner;

public class SingleMultiLine {

    static int enterValue(String message, Scanner scanner) {
        System.out.print(message);
        int value = scanner.nextInt();

        return value;
    }

    public static void main(String[] args) {
        int inputCount, sum = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many arguments do you want to sum? ");
        inputCount = scanner.nextInt();

        for (int i = 1; i <= inputCount; i++) {
            String message = "Please enter " + i + " number: ";
            sum += enterValue(message, scanner);
            System.out.println("Current sum is: " + sum);
        }

        System.out.println("================================\nTotal sum is: "
                + sum
                + "\n================================");
        scanner.close();
    }
}
