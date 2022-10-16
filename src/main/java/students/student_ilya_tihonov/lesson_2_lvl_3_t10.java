package students.student_ilya_tihonov;

import java.util.Scanner;

public class lesson_2_lvl_3_t10 {

    public static void main(String[] args) {

        double R, R2, D, Perimeter, Area, Pi;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas enter radius");
        R = scanner.nextDouble();
        D = R * 2;
        Pi = 3.14159;
        Perimeter = D * Pi;
        R2 = R * R;
        Area = Pi * R2;
        System.out.println("Perimeter is = " + Perimeter);
        System.out.println("Area is = " + Area);

    }

}

