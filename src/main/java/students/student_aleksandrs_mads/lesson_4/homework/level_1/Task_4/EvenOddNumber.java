package students.student_aleksandrs_mads.lesson_4.homework.level_1.Task_4;


import java.util.Scanner;

class EvenOddNumber {
    public static void main(String[] args) {
        int userNumber;
        System.out.println("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        userNumber = scanner.nextInt();
        EvenOddNumber evenOddNumber = new EvenOddNumber();
        int numberAfterDivision = evenOddNumber.division(userNumber);
        if (numberAfterDivision == 0) {
            System.out.println("Number even");
        } else {
            System.out.println("Number odd");
        }
    }

    int division(int userNumber) {
        int divisionResult = userNumber % 2;
        return divisionResult;
    }
}




