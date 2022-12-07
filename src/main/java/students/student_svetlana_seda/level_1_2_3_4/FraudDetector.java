package students.student_svetlana_seda.level_1_2_3_4;

class FraudDetector {

    //Rule1
    boolean isFraud(Transaction t) {
        String blockPokemon = "Pokemon";
        if (t.getTrader().getFullName().equals(blockPokemon)) {
            System.out.println("Rejected!You are blocked!");
            return false;
        } else {
            System.out.println("Accepted!");
            return true;
        }
    }

    //Rule2
    boolean checkTransaction(Transaction t) {
        if (t.getAmount() >= 1000000) {
            System.out.println("More than 100000 will be rejected!");
            return false;
        } else {
            System.out.println("Your transaction accepted!");
            return true;
        }
    }

    //Rule3
    boolean checkCity(Transaction t) {
        String blockSydney = "Sydney";
        String blockJamaica = "Jamaica";
        if (t.getTrader().getCity().equals(blockSydney)) {
            System.out.println("We do not accept transactions from Sydney!");
            return false;
        }
        if (t.getTrader().getCity().equals(blockJamaica)) {
            System.out.println("We do not accept transactions from Jamaica!");
            return false;
        } else {
            System.out.println("Accepted from your city!");
            return true;
        }
    }

    boolean checkIfGermanyAnd1000(Transaction t) {
        String countryGermanyBlockIf1000 = "Germany";
        int sumBlockIf1000 = 1000;
        if (t.getTrader().getCity().equals(countryGermanyBlockIf1000) && t.getAmount() == sumBlockIf1000) {
            System.out.println("Your transaction from Germany 1000 or more  is rejected. Sorry, you are blocked!");
            return false;
        } else {
            System.out.println("Your transaction accepted!");
            return true;
        }
    }

}





