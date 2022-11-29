package students.student_svetlana_seda.lesson_7.homework.level_6;

import java.util.Scanner;

class CreditCardDemo {

    public static void main(String[] args) {
        CreditCard visa = new CreditCard(565656565, 1234);
        visa.setCardName("Visa");
        visa.setCreditLimit(1000);
        System.out.println(visa);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Pin Code!");
        visa.depositMoney(scanner.nextInt(), 2000);
        System.out.println(visa);
        System.out.println("Please enter Pin Code!");
        visa.withdrawMoney(scanner.nextInt(), 1000);
        System.out.println(visa);
        System.out.println("Please enter Pin Code!");
        visa.withdrawMoney(scanner.nextInt(), 30);
        System.out.println(visa);

    }

}

