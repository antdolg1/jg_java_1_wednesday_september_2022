package students.student_oskars_popens.lesson_8.level1_level5;

class FraudRule2 extends FraudRule {
    public FraudRule2(String ruleName){
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        // Rule 2 - reject all txns where amount is over 1000000
        if (t.getAmount() > 1000000){
            return true;
        }
        return false;
    }
}
