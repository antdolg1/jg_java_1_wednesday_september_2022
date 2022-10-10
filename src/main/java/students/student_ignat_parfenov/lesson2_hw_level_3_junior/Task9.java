package students.student_ignat_parfenov.lesson2_hw_level_3_junior;

import java.util.Scanner;

public class Task9 {public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Test Data: " + "\nInput a number: ");
    int yourNumber = scanner.nextInt();
    System.out. println("____________________");
    System.out.println("Expected result is :");

    int i = 1;
    while (i <= 10) {
    int result = yourNumber * i;
    System.out.print(yourNumber + " x " + i + " = " + result + "\n");
        i++;
    }

}
}


