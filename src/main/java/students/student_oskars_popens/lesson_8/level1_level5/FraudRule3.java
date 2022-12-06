package students.student_oskars_popens.lesson_8.level1_level5;

class FraudRule3 extends FraudRule {
    public FraudRule3(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        // Rule 3 - reject all txns where city is Sydney
        if (t.getTrader().getCity().equals("Sydney")) {
            return true;
        }
        return false;
    }
}
