package students.student_ignat_parfenov.lesson_8.homework.level_1_4;

class Trader {
    private String fullName;
    private String city;
    private String country;

    public Trader(String fullName, String city, String country) {
        this.fullName = fullName;
        this.city = city;
        this.country = country;
    }

    public String getFullName() {
        return this.fullName;
    }

    public String getCity() {
        return this.city;
    }

    public String getCountry() {
        return country;
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

    boolean isFraud(Transaction trader) {
        return false;
    }

    boolean isTransactionAmountIsTooBig(Transaction amount) {
        return false;
    }
}



