package teacher.lesson_7.lessoncode;

import java.util.Scanner;

public class CreditCardDemo {

    public static void main(String[] args) {

        CreditCard americanExpress = new CreditCard(123456789, 0000);
        americanExpress.setCreditLimit(300);
        americanExpress.setCardName("AMERICAN_EXPRESS");

        System.out.println(americanExpress);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter PIN: ");
        americanExpress.depositMoney(scanner.nextInt(), 300);

//        System.out.println(americanExpress);
//        System.out.println("Please enter PIN: ");
//        americanExpress.withdrawMoney(scanner.nextInt(), 200);
//
//        System.out.println(americanExpress);
//        System.out.println("Please enter PIN: ");
//        americanExpress.withdrawMoney(scanner.nextInt(), 150);
//
//        System.out.println(americanExpress);

    }
}
