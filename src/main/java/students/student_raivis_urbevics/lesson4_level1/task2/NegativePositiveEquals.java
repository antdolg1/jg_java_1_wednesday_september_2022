package students.student_raivis_urbevics.lesson4_level1.task2;

  import java.util.Scanner;
    class NegativePositiveEquals {

    public static void main(String[] args) {

        System.out.println("Input the any number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number > 0) {
            System.out.println("Number is positive");
        }
         else if (number < 0) {
            System.out.println("Number is negative");
        }
            else {
            System.out.println("Number equals to  0");
        }
    }
}
