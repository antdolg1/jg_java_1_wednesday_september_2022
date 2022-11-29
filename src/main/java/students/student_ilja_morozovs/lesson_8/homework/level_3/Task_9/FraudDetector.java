package students.student_ilja_morozovs.lesson_8.homework.level_3.Task_9;

class FraudDetector {

//    public static void main(String[] args) {
//        Trader trader = new Trader("Pokemon", "Riga");
//        Transaction transaction = new Transaction(trader, 12000);
//        FraudDetector fraudDetector = new FraudDetector();
////        System.out.println(fraudDetector.isFraud1(transaction));
//        fraudDetector.transactionStatus(fraudDetector.isFraud(transaction));
//    }

    void transactionStatus(boolean condition) {
        if (condition) {
            System.out.println("Transaction confirmed!!!");
        } else {
            System.out.println("Transaction blocked!!!");
        }
    }
/*
    boolean isFraud1(Transaction t) {
        String blackListName = "Pokemon";
        double amountRule = 1000000;
        if (!t.getTrader().getFullName().equals(blackListName) && t.getAmount() < amountRule) {
            System.out.println("Transaction confirmed!!!");
            return true;
        } else {
            System.out.println("Transaction blocked!!!");
            return false;
        }
    }
    Думаю теперь метод isFraud лучше
*/
    boolean isFraud(Transaction t) {
        String blackListName = "Pokemon";
        double amountRule = 1000000;
        return !t.getTrader().getFullName().equals(blackListName) && t.getAmount() < amountRule;
    }

}
