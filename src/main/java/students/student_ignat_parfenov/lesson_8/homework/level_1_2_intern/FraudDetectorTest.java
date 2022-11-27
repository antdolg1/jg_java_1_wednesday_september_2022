package students.student_ignat_parfenov.lesson_8.homework.level_1_2_intern;

public class FraudDetectorTest {

    public static void main(String[] args) {

        Trader trader1 = new Trader("Pokemon", "New York");
        Transaction transaction1 = new Transaction(trader1, 55000);
        if (trader1.getFullName().equals("Pokemon")) {
            System.out.println("Transaction is interrupted. Test is FAILED");
        } else if ((transaction1.getAmount() > 1000000)) {
            System.out.println("Transaction is interrupted. The sum of transaction is exceeded! Test is FAILED");
        } else {
            System.out.println("Transaction is APPLIED. Test is OK");
        }
    }
}

