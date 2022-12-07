package students.student_svetlana_seda.level_1_2_3_4;

class Transaction {

    private Trader trader;
    private int amount;


    public Transaction(Trader trader, int amount) {
        this.trader = trader;
        this.amount = amount;

    }

    public Trader getTrader() {
        return trader;
    }

    public int getAmount() {
        return amount;
    }

}
