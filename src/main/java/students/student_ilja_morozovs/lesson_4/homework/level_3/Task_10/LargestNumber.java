package students.student_ilja_morozovs.lesson_4.homework.level_3.Task_10;

import java.util.Scanner;

class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number one: ");
        int userNumber1 = scanner.nextInt();
        System.out.println("Please enter number two: ");
        int userNumber2 = scanner.nextInt();
        System.out.println("Please enter number three: ");
        int userNumber3 = scanner.nextInt();
        if (userNumber1 < userNumber3 && userNumber2 <= userNumber3) {
            System.out.println("The larger number is: " + userNumber3);
        } else if (userNumber2 >= userNumber1 && userNumber2 > userNumber3) {
            System.out.println("The larger number is: " + userNumber2);
        } else {
            System.out.println("The larger number is: " + userNumber1);
        }
    }
}
/*1 1 3 number1 < number3 & number2 < number3
  1 3 1
  3 1 1
  1 3 3
  3 3 1
 */
