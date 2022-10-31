package teacher.lesson_5.lessoncode;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {

        int userNumberValue = 0;

        while (userNumberValue <= 10) {
            System.out.println("Hello! Value is: " + userNumberValue + "\n");
            userNumberValue++;
        }

        //------------------------

        for (int i = 1; i <= 10; i++) {
            System.out.println("Hello! Value is: " + i);
        }

        //------------------------

        do {
            System.out.println("Hello! Value is " + userNumberValue);
            userNumberValue++;
        } while (userNumberValue <= 10);

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Please enter number:");
            userNumberValue = scanner.nextInt();
        } while (userNumberValue != 7);

        System.out.println("Got 7!!!");

        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }

        for (int j = 100; j >= 1; j--) {
            System.out.println(j);
        }

    }
}
