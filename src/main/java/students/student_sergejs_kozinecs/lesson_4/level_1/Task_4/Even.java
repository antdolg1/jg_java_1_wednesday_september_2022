package students.student_sergejs_kozinecs.lesson_4.level_1.Task_4;

import java.util.Scanner;

class Even {
    static String isEven(int number) {
        return number % 2 == 0 ? "is even" : "isn't even";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter int number:");
        String isEven = isEven(scanner.nextInt());

        System.out.println("This number " + isEven);

        scanner.close();
    }
}