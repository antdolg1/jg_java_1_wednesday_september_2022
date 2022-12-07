package students.student_svetlana_seda.level_1_2_3_4;

class FraudDetectorTest {

    public static void main(String[] args) {

        Trader traderPokemon = new Trader("Pokemon", "Daugavpils");
        Transaction transactionPokemon = new Transaction(traderPokemon, 100);
        FraudDetector fraudDetector = new FraudDetector();
        System.out.println(fraudDetector.isFraud(transactionPokemon));

        System.out.println("_____________________________");

        Trader traderLana = new Trader("Lana", "Riga");
        Transaction transactionLana = new Transaction(traderLana, 100);
        System.out.println(fraudDetector.isFraud(transactionLana));
        System.out.println("_______________________________________");

        FraudDetectorTest fraudDetectorTest = new FraudDetectorTest();
        fraudDetectorTest.checkTransactionTest();
        fraudDetectorTest.checkCityTest();
        fraudDetectorTest.checkIfGermanyAnd1000Test();

    }

    void checkTransactionTest() {

        Trader traderLana = new Trader("Lana", "Riga");
        Transaction transactionLana = new Transaction(traderLana, 1000000);
        FraudDetector fraudDetector = new FraudDetector();
        System.out.println(fraudDetector.checkTransaction(transactionLana));
        Trader traderAna = new Trader("Ana", "Riga");
        Transaction transactionAna = new Transaction(traderAna, 1000000);
        System.out.println(fraudDetector.checkTransaction(transactionAna));
    }


    void checkCityTest() {
        System.out.println("____________________________________");
        Trader traderFromSydney = new Trader("Robert", "Sydney");
        Transaction transactionFromSydney = new Transaction(traderFromSydney, 100);
        FraudDetector fraudDetector = new FraudDetector();
        System.out.println(fraudDetector.checkCity(transactionFromSydney));

        Trader traderAnastasia = new Trader("Anastasia", "Riga");
        Transaction transactionAnastasia = new Transaction(traderAnastasia, 100);
        System.out.println(fraudDetector.checkCity(transactionAnastasia));
        System.out.println("____________________________________");

        Trader traderFromJamaica = new Trader("Mike", "Jamaica");
        Transaction transactionFromJamaica = new Transaction(traderFromJamaica, 100);
        System.out.println(fraudDetector.checkCity(transactionFromJamaica));
    }

    void checkIfGermanyAnd1000Test() {
        System.out.println("____________________________________");
        Trader traderFromGermany = new Trader("Rob", "Germany");
        Transaction transactionFromGermany = new Transaction(traderFromGermany, 1000);
        FraudDetector fraudDetector = new FraudDetector();
        System.out.println(fraudDetector.checkIfGermanyAnd1000(transactionFromGermany));

        Trader traderAnastasia = new Trader("Anastasia", "Riga");
        Transaction transactionAnastasia = new Transaction(traderAnastasia, 1000);
        System.out.println(fraudDetector.checkIfGermanyAnd1000(transactionAnastasia));
    }

}
