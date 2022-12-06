package students.student_oskars_popens.lesson_8.level1_level5;

class Transaction {
    private Trader trader;
    private int amount;

    Transaction(Trader trader, int amount){
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
