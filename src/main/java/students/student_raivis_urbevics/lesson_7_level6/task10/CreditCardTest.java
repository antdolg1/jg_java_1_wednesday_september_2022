package students.student_raivis_urbevics.lesson_7_level6.task10;

class CreditCardTest {
    public static void main(String[] args) {

        CreditCardTest creditCardTest = new CreditCardTest();
        creditCardTest.depositMoneyTest();
        creditCardTest.withDrawMoneyTest();
        creditCardTest.negativeResultTest();
        creditCardTest.creditDebtTest();

    }

    void depositMoneyTest() {
        CreditCard creditCard = new CreditCard(316459678, 5422, 0, 0);
        creditCard.depositMoney(5422, 1000);
        creditCard.setCardName("Master Card");
        System.out.println(creditCard);
    }

    void withDrawMoneyTest() {
        CreditCard creditCard = new CreditCard(547856789, 6576, 0, 0);
        creditCard.setBalance(1000);
        creditCard.withDrawMoney(6576, 500);
        creditCard.setCardName("Master Card");
        System.out.println(creditCard);

    }

    void negativeResultTest() {
        CreditCard creditCard = new CreditCard(434567678, 5476, 0, 0);
        creditCard.setBalance(1000);
        creditCard.setCreditLimit(500);
        creditCard.withDrawMoney(5476, 2000);
    }

    void creditDebtTest() {
        CreditCard creditCard = new CreditCard(454578567, 6484, 0, 0);
        creditCard.setCardName("Master Card");
        creditCard.setCreditLimit(1000);
        creditCard.setBalance(1000);
        creditCard.withDrawMoney(6484, 1200);
        System.out.println(creditCard);
    }
}
