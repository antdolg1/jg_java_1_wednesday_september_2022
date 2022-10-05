package students.student_maksims_cerkasovs;
import java.util.Scanner;
public class test_02 {
  public static void main(String[] args) {

    System.out.println("Эта программа сложит два числа: ");
    Scanner scanner = new Scanner(System.in);
  System.out.print("Ведите первое число: ");
    int n1 = scanner.nextInt();
  System.out.print("Теперь второе число: ");
    int n2 = scanner.nextInt();
    int sum = n1 + n2;
  System.out.print("Результат:");
  System.out.print(sum);
  }
}