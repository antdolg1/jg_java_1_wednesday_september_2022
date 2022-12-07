package students.student_ilja_morozovs.lesson_8.homework.level_3.Task_12;

class FraudDetectorTest {

    public static void main(String[] args) {
        FraudDetectorTest fraudDetectorTest = new FraudDetectorTest();
        fraudDetectorTest.condition(fraudDetectorTest.isFraudTest());
    }

    boolean isFraudTest() {
        Trader trader = new Trader("Dimon", "Sydney");
        Transaction transaction = new Transaction(trader, 120000);
        FraudDetector fraudDetector = new FraudDetector();
        return fraudDetector.isFraud(transaction, trader);
    }

    void condition(boolean condition) {
        if (condition) {
            System.out.println("Test is OK!!!");
        } else {
            System.out.println("Test is FAIL!!!");
        }
    }
}
