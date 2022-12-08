package students.student_raivis_urbevics.lesson8_level1;

class FraudDetector {

    boolean isFraud(Transaction t) {

        String blockedTrader = "Pokemon";

        if (!t.getTrader().getFullName().equals(blockedTrader)) {
            System.out.println("Transaction was successful!");
            return true;
        } else {
            System.out.println("Fraud Detector worked, transaction is blocked!");
            return false;
        }
    }

    boolean checkAmount(Transaction t) {

        if (t.getAmount() >= 1000000) {
            System.out.println("Transaction is renounced!");
            return true;
        } else {
            System.out.println("Transaction was successful");
            return false;
        }
    }

    boolean checkCity(Trader t) {

        String blockedCity = "Sidney";

        if (!t.getCity().equals(blockedCity)) {
            System.out.println("Transaction was successful!");
            return true;
        } else {
            System.out.println("You are from Sidney!,Transaction is BLOCKED! ");
            return false;
        }
    }

    boolean checkCountry(Trader t) {

        String blockedCountry = "Jamaica";

        if (!t.getCountry().equals(blockedCountry)) {
            System.out.println("Transaction was successful!");
            return true;
        } else {
            System.out.println("You are from Jamaica!,Transaction is BLOCKED!");
            return false;
        }
    }

    boolean checkCountryAndAmount(Transaction t) {

        String blockedCountry = "Germany";

        int blockedAmount = 1000;

        if (!t.getTrader().getCountry().equals(blockedCountry) || t.getAmount() <= blockedAmount) {
            System.out.println("Transaction was successful!");
            return true;
        } else {
            System.out.println("Germany transaction limit = 1000,transaction is BLOCKED!!!");
            return false;
        }
    }
}
