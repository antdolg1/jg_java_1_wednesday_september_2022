package students.student_ilja_morozovs.lesson_2.homework.level_3.Task_9;

import java.util.Scanner;

class MultiTab {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber;
        System.out.println("Test date:\nPlease input number: ");
        inputNumber = scanner.nextInt();
        int result;
        System.out.println("Expected Output :");
        for (int i = 1; i <= 10; i++) {
            result = inputNumber * i;
            System.out.println(inputNumber + " X " + i + " = " + result);
        }
    }
}

