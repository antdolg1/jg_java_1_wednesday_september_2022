package students.student_oleg_gryazev.lesson_5.level_4;

import java.util.Random;
import java.util.Scanner;

class Massive {

     public static void main(String[] args) {          // Task 26
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter massive lenght");
        int len = scanner.nextInt();
        int [] num = new int[len + 1];

for(int i = 0; i <= len ; i ++) {
    Random random = new Random();

    int number = random.nextInt(100);
   num[i] = number;

        System.out.println("Your numbers in order of array elements, from " + i + " = " + num [i] );
    }
}
    }
class Massive1 {

    public static void main(String[] args) {          // Task 25
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter massive length");
        System.out.println("Enter your numbers");
        int len = scanner.nextInt();
        int [] num = new int[len + 1];
       // Scanner scanner = new Scanner(System.in);
        for(int i = 0; i <= len ; i ++) {
            int number = scanner.nextInt();
            num[i] = number;

            System.out.println("Your numbers in order of array elements, from " + i + " = " + num [i] );
        }
    }
}