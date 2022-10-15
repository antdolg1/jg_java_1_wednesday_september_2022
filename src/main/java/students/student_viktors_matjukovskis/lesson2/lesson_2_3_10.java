package students.student_viktors_matjukovskis.lesson2;

import java.util.Scanner;

public class lesson_2_3_10 {

   public static void main(String[] args) {

   Scanner radius = new Scanner(System.in);
   System.out.println("введите радиус круга");
   double r = radius.nextDouble();
   double res = (r * 2 * 3.14);
   System.out.println("периметр круга: " + res);

   double res2 = (r * 2 * 3.14);
   double a1 = r;
   double b1 = 2;
   double res3 = (Math.pow(a1, b1) * 3.14);
       System.out.println("площадь круга: " + res3);
}
}
