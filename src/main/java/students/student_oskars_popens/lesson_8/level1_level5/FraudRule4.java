package students.student_oskars_popens.lesson_8.level1_level5;

class FraudRule4 extends FraudRule {
    public FraudRule4(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        // Rule 4 - reject all txns where caoutry is Jamaica
        if (t.getTrader().getCountry().equals("Jamaica")) {
            return true;
        }
        return false;
    }
}