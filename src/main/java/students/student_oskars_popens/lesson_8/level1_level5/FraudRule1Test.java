package students.student_oskars_popens.lesson_8.level1_level5;

class FraudRule1Test {
    public static void main(String[] args) {
        FraudRule1Test test = new FraudRule1Test();
        test.shouldBeFraudRule1();
        test.shouldNotBeFraudRule1();
        test.shouldBeFraudRule2();
        test.shouldNotBeFraudRule2();
        test.shouldBeFraudRule3();
        test.shouldNotBeFraudRule3();
        test.shouldBeFraudRule4();
        test.shouldNotBeFraudRule4();
        test.shouldBeFraudRule5();
        test.shouldNotBeFraudRule5NotGermany();
        test.shouldNotBeFraudRule5NotAmount();
    }

    private void shouldBeFraudRule1() {
        Trader trader = new Trader("Pokemon", "New York");
        int amount = 100;
        Transaction transaction = new Transaction(trader, amount);
        FraudRule1 fraud = new FraudRule1("Rule 1");

        checkResults(fraud.isFraud(transaction), "Should be fraud by Rule 1");
    }

    private void shouldNotBeFraudRule1() {
        Trader trader = new Trader("Richard", "New York");
        int amount = 100;
        Transaction transaction = new Transaction(trader, amount);
        FraudRule1 fraud = new FraudRule1("Rule 1");

        checkResults(!fraud.isFraud(transaction), "Should not be fraud by Rule 1");
    }

    private void shouldBeFraudRule2() {
        Trader trader = new Trader("Alexander", "Sydney");
        int amount = 100;
        Transaction transaction = new Transaction(trader, amount);
        FraudRule2 fraud = new FraudRule2("Rule 2");

        checkResults(fraud.isFraud(transaction), "Should be fraud by Rule 2");
    }

    private void shouldNotBeFraudRule2() {
        Trader trader = new Trader("Alexander", "New York");
        int amount = 100;
        Transaction transaction = new Transaction(trader, amount);
        FraudRule2 fraud = new FraudRule2("Rule 2");

        checkResults(!fraud.isFraud(transaction), "Should not be fraud by Rule 2");
    }

    private void shouldBeFraudRule3() {
        Trader trader = new Trader("Alexander", "Toronto");
        int amount = 1000001;
        Transaction transaction = new Transaction(trader, amount);
        FraudRule3 fraud = new FraudRule3("Rule32");

        checkResults(fraud.isFraud(transaction), "Should be fraud by Rule 3");
    }

    private void shouldNotBeFraudRule3() {
        Trader trader = new Trader("Alexander", "Toronto");
        int amount = 10000;
        Transaction transaction = new Transaction(trader, amount);
        FraudRule3 fraud = new FraudRule3("Rule 3");

        checkResults(!fraud.isFraud(transaction), "Should not be fraud by Rule 3");
    }

    private void shouldBeFraudRule4() {
        Trader trader = new Trader("Alexander", "Kingston", "Jamaica");
        int amount = 1000;
        Transaction transaction = new Transaction(trader, amount);
        FraudRule4 fraud = new FraudRule4("Rule 4");

        checkResults(fraud.isFraud(transaction), "Should be fraud by Rule 4");
    }

    private void shouldNotBeFraudRule4() {
        Trader trader = new Trader("Alexander", "Kingston", "Qatar");
        int amount = 1000;
        Transaction transaction = new Transaction(trader, amount);
        FraudRule4 fraud = new FraudRule4("Rule 4");

        checkResults(!fraud.isFraud(transaction), "Should not be fraud by Rule 4");
    }

    private void shouldBeFraudRule5() {
        Trader trader = new Trader("Paul", "Berlin", "Germany");
        int amount = 1001;
        Transaction transaction = new Transaction(trader, amount);
        FraudRule5 fraud = new FraudRule5("Rule 5");

        checkResults(fraud.isFraud(transaction), "Should be fraud by Rule 5 (Germany and over 1000");
    }

    private void shouldNotBeFraudRule5NotGermany() {
        Trader trader = new Trader("Alexander", "Berlin", "Poland");
        int amount = 100001;
        Transaction transaction = new Transaction(trader, amount);
        FraudRule5 fraud = new FraudRule5("Rule 5");

        checkResults(!fraud.isFraud(transaction), "Should not be fraud by Rule 5 (Not Germany and over 1000");
    }

    private void shouldNotBeFraudRule5NotAmount() {
        Trader trader = new Trader("Alexander", "Berlin", "Germany");
        int amount = 100;
        Transaction transaction = new Transaction(trader, amount);
        FraudRule5 fraud = new FraudRule5("Rule 5");

        checkResults(!fraud.isFraud(transaction), "Should not be fraud by Rule 5 (Germany but not over limit)");
    }

    private void checkResults(boolean result, String testName) {
        System.out.println(testName + " : Test " + (result ? "Ok" : "False"));
    }
}
