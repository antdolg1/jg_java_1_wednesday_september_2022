package students.student_ignat_parfenov.lesson_8.homework.level_1_intern;

class Trader {
    private String fullName;
    private String city;

    public Trader(String fullName, String city) {
        this.fullName = fullName;
        this.city = city;
    }
}

class Transaction {
    private Trader trader;
    private int amount;

    public Transaction(Trader trader, int amount) {
        this.trader = trader;
        this.amount = amount;
    }
}

class FraudDetector {
    boolean isFraud(Transaction t) {
        return true;
    }
}

