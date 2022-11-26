package students.student_ignat_parfenov.lesson_8.homework.level_1_intern;

class Trader {
    private String fullName;
    private String city;
}

class Transaction {

    private Trader trader;
    private int amount;
}

class FraudDetector {
    boolean isFraud(Transaction t) {
        return true;
    }
}

