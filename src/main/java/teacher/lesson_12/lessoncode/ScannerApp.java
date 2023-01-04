package teacher.lesson_12.lessoncode;

import java.io.IOException;
import java.util.Scanner;

public class ScannerApp {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            int number = scanner.nextInt();

            if (number == 0) {
                throw new IOException("Wrong number entered!");
            }
        }
    }
}
