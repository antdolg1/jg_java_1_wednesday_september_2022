package students.student_ilja_morozovs.lesson_8.homework.level_2.Task_7;

class FraudDetector {

    public static void main(String[] args) {
        Trader trader = new Trader("Dimon", "Riga");
        Transaction transaction = new Transaction(trader, 500);
        FraudDetector fraudDetector = new FraudDetector();
        //System.out.println(fraudDetector.isFraud1(transaction));
    }

    boolean isFraud1(Transaction t) {
        String blackListName = "Pokemon";
        if (!t.getTrader().getFullName().equals(blackListName)) {
            System.out.println("Transaction confirmed!!!");
            return true;
        } else {
            System.out.println("You are Pokemon transaction blocked!!!");
            return false;
        }
    }

    boolean isFraud(Transaction t) {
        String blackListName = "Pokemon";
        return !t.getTrader().getFullName().equals(blackListName);
    }

}
