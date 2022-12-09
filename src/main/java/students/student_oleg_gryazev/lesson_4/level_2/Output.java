package students.student_oleg_gryazev.lesson_4.level_2;

import java.util.Scanner;

class Output {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int z = scanner.nextInt();
        int x = scanner.nextInt();
        if (x > z) {
            System.out.println("X is max. number");
        } else {
            System.out.println(" Y is max. number");
        }
        Scanner skanner = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int a = skanner.nextInt();
        int c = skanner.nextInt();
        if (a < c) {
            System.out.println("X is min. number");
        } else {
            System.out.println(" Y is min. number");

        }
    }
}
class Output1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int z = scanner.nextInt();
        int x = scanner.nextInt();
        if (x == z) {
            System.out.println("The numbers are equal");
        } else {
            System.out.println(" The numbers aren't equal");
        }
    }
}