package students.student_ilya_tihonov;

import java.util.Scanner;

public class lesson_2_lvl_3_t11 {

    public static void main(String[] args) {

        int a, b, c, abc, abc1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write 3 numbers to calculate the arithmetic mean");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        abc = a + b + c;
        abc1 = abc / 3;
        System.out.println("The arithmetic mean is - " + abc1);


    }

}
