package students.student_ignat_parfenov.lesson_8.homework.level_1_2_intern;

public class FraudDetectorTest {

    public static void main(String[] args) {

        Trader trader1 = new Trader("Pokemon", "New York");
        if (trader1.getFullName().equals("Pokemon")) {
            System.out.println("Transaction is interrupted. Test is FAILED");
        } else {
            System.out.println("Transaction is done. Test is OK");
        }

        Transaction transaction1 = new Transaction(trader1, 120000);
        if (transaction1.getAmount() <= 100000) {
            System.out.println("Transaction is declined. The sum is over 100000. Test is FAILED");
        } else {
            System.out.println("Transaction is APPLIED. Test is OK");
        }
    }
}

