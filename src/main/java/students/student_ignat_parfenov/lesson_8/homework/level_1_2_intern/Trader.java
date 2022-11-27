package students.student_ignat_parfenov.lesson_8.homework.level_1_2_intern;

class Trader {
    private String fullName;
    private String city;

    public Trader(String fullName, String city) {
        this.fullName = fullName;
        this.city = city;
    }

    public String getFullName() {
        return this.fullName;
    }

    public String getCity() {
        return this.city;
    }
}

class Transaction {
    private Trader trader;
    private int amount;

    Transaction(Trader trader, int amount) {
        this.trader = trader;
        this.amount = amount;
    }

    public Trader getTrader() {
        return this.trader;
    }

    public int getAmount() {
        return this.amount;
    }
}

class FraudDetector {

    boolean isFraud(Transaction t) {
        return false;
    }

    boolean isTransactionAmountIsTooBig(Transaction amount) {
        return false;
    }
}


