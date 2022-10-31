package students.student_raivis_urbevics.Lesson_2_Level3;
import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the any number");
        int n1 = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println("n1*" + i + " = " + n1 * i);
        }
    }
}
