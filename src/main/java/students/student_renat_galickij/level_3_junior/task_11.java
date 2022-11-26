package students.student_renat_galickij.level_3_junior;
import java.util.Scanner;

public class task_11 {
    public static void main(String[] args) {
        double average;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstN = scanner.nextInt();
        System.out.println("Enter second number");
        int secondN = scanner.nextInt();
        System.out.println("Enter third number");
        int thirdN = scanner.nextInt();

        average = ((double)(firstN + secondN + thirdN) / 3);
        System.out.println("Average is " + average );

    }
}
