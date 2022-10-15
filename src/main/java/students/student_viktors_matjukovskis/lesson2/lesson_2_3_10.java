package students.student_viktors_matjukovskis.lesson2;

import java.util.Scanner;

public class lesson_2_3_10 {

   public static void main(String[] args) {

      Scanner radius = new Scanner(System.in);
      System.out.println("Введите радиус круга: ");

      double r = radius.nextDouble();
      double res = (r * 2 * Math.PI);
      System.out.println("------------------------");
      System.out.println("Периметр круга: " + res);

      double res3 = (Math.pow(r,2) * Math.PI);
      System.out.println("Площадь круга: " + res3);

   }
}
