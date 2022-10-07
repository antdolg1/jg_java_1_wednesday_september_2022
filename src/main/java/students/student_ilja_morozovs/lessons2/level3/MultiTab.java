package students.student_ilja_morozovs.lessons2.level3;

import java.util.Scanner;

public class MultiTab {
    int inputNumber;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MultiTab multiTab = new MultiTab();
        System.out.println("Test date:\nPlease input number: ");
        multiTab.inputNumber = scanner.nextInt();
        int result;
        System.out.println("Expected Output :");
        for (int i = 1; i <= 10; i++) {
            result = multiTab.inputNumber * i;
            System.out.println(multiTab.inputNumber + " X " + i + " = " + result);
        }
    }
}

