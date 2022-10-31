package students.student_raivis_urbevics.lesson3_level2;

import java.util.Scanner;

        class ScannerUse{
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the username");
        String userName = scanner.next();
        System.out.println("Hello " + userName);
    }
}
