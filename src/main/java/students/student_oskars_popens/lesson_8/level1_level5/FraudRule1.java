package students.student_oskars_popens.lesson_8.level1_level5;

class FraudRule1 extends FraudRule {
    public FraudRule1(String ruleName){
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        // Rule 1 - reject all txns where trader is Pokemon
        if (t.getTrader().getFullName().equals("Pokemon")){
            return true;
        }
        return false;
    }
}
