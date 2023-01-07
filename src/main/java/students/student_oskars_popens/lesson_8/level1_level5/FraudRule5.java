package students.student_oskars_popens.lesson_8.level1_level5;

class FraudRule5 extends FraudRule {
    public FraudRule5(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        // Rule 5 - reject all txns from Germany with amount over 1000
        if (t.getTrader().getCountry().equals("Germany") &&
                t.getAmount() > 1000){
            return true;
        }
        return false;
    }
}