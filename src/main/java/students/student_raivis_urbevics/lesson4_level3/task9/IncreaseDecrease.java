package students.student_raivis_urbevics.lesson4_level3.task9;

import java.util.Scanner;

class IncreaseDecrease {
    public static void main(String[] args) {
        System.out.println("Input the first number");
        System.out.println("Input the second number");
        System.out.println("Input the third number");
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        if (n1 > n2 && n1 > n3 && n2 > n3) {
            System.out.println("Decreasing ");
        } else if (n1 < n2 && n1 < n3 && n2 < n3) {
            System.out.println("Increasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}

