package students.student_svetlana_seda.lesson_7.homework.level_6.task_10;

class CreditCardTest {

    public static void main(String[] args) {

        CreditCardTest creditCardTest = new CreditCardTest();
        creditCardTest.depositMoneyTest();
        creditCardTest.withdrawMoneyTest();

    }

    void depositMoneyTest() {
        CreditCard creditCard = new CreditCard(316459678, 5422);
        creditCard.depositMoney(5422, 1000);
        creditCard.setCardName("Master Card");
        System.out.println(creditCard);
    }

    void withdrawMoneyTest() {
        CreditCard creditCard = new CreditCard(565656565, 1234);
        creditCard.setBalance(1000);
        creditCard.withdrawMoney(1234, 50);
        creditCard.setCardName("Visa");
        System.out.println(creditCard);

    }

}
