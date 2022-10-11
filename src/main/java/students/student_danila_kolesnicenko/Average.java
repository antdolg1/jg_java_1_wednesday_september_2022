package students.student_danila_kolesnicenko;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int userNumber1;
        int userNumber2;
        int userNumber3;


        System.out.println("Please, enter your numbers: ");

        userNumber1 = scanner.nextInt();
        userNumber2 = scanner.nextInt();
        userNumber3 = scanner.nextInt();
        double sum = userNumber1 + userNumber2 + userNumber3;

        System.out.println(sum / 3);


    }
}
