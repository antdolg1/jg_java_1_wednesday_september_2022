package students.student_raivis_urbevics.lesson4_level3.task9;

import java.util.Scanner;

public class Increase {
    public static void main(String[] args) {
        System.out.println("Input the first number");
        System.out.println("Input the second number");
        System.out.println("Input the third number");
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        if (n1 > n3 && n3 > n2) {
            System.out.println(n1 + " " + n2 + "  " + n3);
        } else if (n2 > n1 && n1 > n3) {
            System.out.println(n2 + " " + n1 + " " + n3);
        } else if (n3 > n2 && n2 > n1) {
            System.out.println(n3 + " " + n2 + " " + n1);

        } else if (n3 > n1 && n1 > n2) {
            System.out.println(n3 + "" + n1 + " " + n2);
        } else if (n1 > n2 && n2 > n3) {
            System.out.println(n1 + " " + n2 + " " + n3);
        }
          else if (n2 > n3 && n3 > n1) {
            System.out.println(n2 + " " +n3 + " "+n1);

        }
    }
}


















