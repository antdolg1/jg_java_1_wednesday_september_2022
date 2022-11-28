package students.student_ignat_parfenov.lesson_8.homework.level_1_2_intern;

public class FraudDetectorTest {

    public static void main(String[] args) {

        Trader trader1 = new Trader("Pokemon", "Sydney");
        FraudDetector fraudDetector = new FraudDetector();
        Transaction transaction1 = new Transaction(trader1, 550000);
        if (trader1.getFullName().equals("Pokemon")) {
            System.out.println("FRAUD, Pokemon!! Transaction is interrupted. Test is FAILED");
        } else if (fraudDetector.isTransactionAmountIsTooBig(transaction1)) {
            System.out.println("FRAUD!! Transaction is interrupted. The sum of transaction is exceeded! Test is FAILED");
        } else if (trader1.getCity().equals("Sydney")) {
            System.out.println("FRAUD!! All transactions from Sydney (AUS) are prohibited. Test is FAILED");
        } else {
            System.out.println("Transaction is APPLIED. Test is OK");
        }
    }
}

