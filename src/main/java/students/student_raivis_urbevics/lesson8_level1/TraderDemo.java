package students.student_raivis_urbevics.lesson8_level1;

class TraderDemo {

    public static void main(String[] args) {

        Trader trader = new Trader("Pokemon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1000);
        FraudDetector fraudDetector = new FraudDetector();
        fraudDetector.isFraud(transaction);

        Trader trader1 = new Trader("Ken", "Shanghai", "China");
        Transaction transaction1 = new Transaction(trader1, 1000000);
        FraudDetector fraudDetector1 = new FraudDetector();
        fraudDetector1.checkAmount(transaction1);

        Trader trader2 = new Trader("Bella", "Sidney", "Australia");
        Transaction transaction2 = new Transaction(trader2, 10000);
        FraudDetector fraudDetector2 = new FraudDetector();
        fraudDetector2.checkCity(trader2);

        Trader trader3 = new Trader("Nick", "Kingston", "Jamaica");
        Transaction transaction3 = new Transaction(trader3, 30000);
        FraudDetector fraudDetector3 = new FraudDetector();
        fraudDetector3.checkCountry(trader3);

        Trader trader4 = new Trader("Ben", "Berlin", "Germany");
        Transaction transaction4 = new Transaction(trader4, 1001);
        FraudDetector fraudDetector4 = new FraudDetector();
        fraudDetector4.checkCountryAndAmount(transaction4);
    }
}
