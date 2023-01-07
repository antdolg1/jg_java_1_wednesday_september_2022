package students.student_oskars_popens.lesson_8.level1_level5;

abstract class FraudRule {
    private String ruleName;

    public FraudRule(String ruleName){
        this.ruleName = ruleName;
    }

    public abstract boolean isFraud(Transaction t);
}
