package students.student_raivis_urbevics.lesson_7_level6.task10;

import teacher.lesson_7.lessoncode.CreditCard;

import java.util.Scanner;

class CreditCardDemo {
    public static void main(String[] args) {
        CreditCard masterCard = new CreditCard(546632232, 3453);
        masterCard.setCardName("Master Card");
        masterCard.setCreditLimit(500);
        System.out.println(masterCard);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Pin Code!");
        masterCard.depositMoney(scanner.nextInt(), 2000);
        System.out.println(masterCard);
        System.out.println("Please enter Pin Code!");
        masterCard.withdrawMoney(scanner.nextInt(), 1000);
        System.out.println(masterCard);
        System.out.println("Please enter Pin Code!");
        masterCard.withdrawMoney(scanner.nextInt(), 3000);
        System.out.println(masterCard);

    }
}
