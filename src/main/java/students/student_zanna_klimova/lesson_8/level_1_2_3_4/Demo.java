package students.student_zanna_klimova.lesson_8.level_1_2_3_4;

public class Demo {
    public static void main(String[] args) {
        FraudDetector fraudDetector = new FraudDetector();
        Trader traderZanna = new Trader("Zanna", "Jamaica");
        Trader traderKira = new Trader("Kira", "Germany");
        Trader traderKate = new Trader("Kate", "Sidney");
        Trader traderPokemon = new Trader("Pokemon", "Vilnius");
        Transaction transactionZanna = new Transaction(traderZanna, 10000000);
        Transaction transactionKira = new Transaction(traderKira, 1200);
        Transaction transactionKate = new Transaction(traderKate, 2000);
        Transaction transactionPokemon = new Transaction(traderPokemon, 1);
        System.out.println(fraudDetector.isFraud(transactionKate));
        System.out.println(fraudDetector.isFraud(transactionPokemon));
        System.out.println("______________________________________");
        System.out.println(fraudDetector.checkCountryJamaica(transactionKate));
        System.out.println(fraudDetector.checkCountryJamaica(transactionZanna));
        System.out.println("________________________________________");
        System.out.println(fraudDetector.checkCountrySidney(transactionKate));
        System.out.println("_____________________________________________");
        System.out.println(fraudDetector.checkCountryandSum(transactionKira));
        System.out.println(fraudDetector.checkCountryandSum(transactionKate));
        // Anton, privet. Ja 4utok ne ponimaju estj li smisl pisatj test, esli
        // ja vot sdesj srazu proverjaju vse varianti sobitij? Spasibo.
    }
}
