package students.student_oskars_popens.lesson_7.level_6_middle;

class CreditCardTest {
    public static void main(String[] args) {
        CreditCardTest test = new CreditCardTest();
        test.setCreditLimitTest();
        test.withdrawWithWrongPin();
        test.withdrawWithOverBalanceWithoutCredit();
        test.withdrawWithOverBalanceWithCredit();
        test.withdrawWithOverBalanceExceededLimit();
        test.depositTestWrongPin();
        test.depositTestWithoutCredit();
        test.depositTestWithCredit();
    }

    private void setCreditLimitTest() {
        CreditCard card = new CreditCard("1234 1234 1234 1234", 1122);
        card.setCreditLimit(10000);
        checkTestResult(card.getCreditLimit() == 10000, "Set credit limit test");
    }

    private void withdrawWithWrongPin() {
        CreditCard card = new CreditCard("1234 1234 1234 1234", 1122);
        checkTestResult(!card.withdraw(1234, 1000) && card.getBalance() == 0,
                "Withdraw with wrong PIN test");
    }

    private void withdrawWithOverBalanceWithoutCredit() {
        CreditCard card = new CreditCard("1234 1234 1234 1234", 1122);
        checkTestResult(!card.withdraw(1122, 1000) && card.getBalance() == 0,
                "Withdraw test over balance without credit limit");
    }

    private void withdrawWithOverBalanceWithCredit() {
        CreditCard card = new CreditCard("1234 1234 1234 1234", 1122);
        card.setCreditLimit(10000);
        checkTestResult(card.withdraw(1122, 1000)
                                && card.getBalance() == 0
                                && card.getCreditBalance()==-1000,
                "Withdraw test with credit limit");
    }

    private void withdrawWithOverBalanceExceededLimit() {
        CreditCard card = new CreditCard("1234 1234 1234 1234", 1122);
        card.setCreditLimit(1000);
        checkTestResult(!card.withdraw(1122, 2000)
                        && card.getBalance() == 0
                        && card.getCreditBalance()==0,
                "Withdraw test over credit limit");
    }

    private void depositTestWrongPin() {
        CreditCard card = new CreditCard("1234 1234 1234 1234", 1122);
        checkTestResult(!card.deposit(1234, 1000), "Deposit with wrong PIN test");
    }

    private void depositTestWithoutCredit() {
        CreditCard card = new CreditCard("1234 1234 1234 1234", 1122);
        checkTestResult(card.deposit(1122, 1000) && card.getBalance() == 1000,
                "Deposit operation test without credit balance");
    }

    private void depositTestWithCredit() {
        CreditCard card = new CreditCard("1234 1234 1234 1234", 1122);
        card.setCreditLimit(10000);
        card.withdraw(1122, 500);
        checkTestResult(card.deposit(1122, 1000) && card.getBalance() == 500,
                "Deposit operation test with credit balance");
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}
