package students.student_zanna_klimova.lesson_8.level_1_2_3_4;

public class FraudDetector {
    boolean checkCountryandSum(Transaction t) {
        String countyFromBlackList = "Germany";
        int sumFromBlackList = 1000;
        if(t.getTrader().getCity().equals(countyFromBlackList) || t.getAmount() == sumFromBlackList) {
            System.out.println("Your transaction is rejected.");
            return false;
        } else {
            System.out.println("Your transaction accepted.");
            return true;
        }
    }

    boolean checkCountrySidney(Transaction t) {
        String countryFromBlackList = "Sidney";
        if(t.getTrader().getCity().equals(countryFromBlackList)) {
            System.out.println("Your transaction is rejected, country is " +
                    "in black list.");
            return false;
        } else {
            System.out.println("Your transaction accepted.");
            return true;
        }
    }

    boolean checkCountryJamaica(Transaction t) {
        String countryFromBlackList = "Jamaica";
        if(t.getTrader().getCity().equals(countryFromBlackList)) {
            System.out.println("Your transaction is rejected, country is " +
                    "in black list.");
            return false;
        } else {
            System.out.println("Your transaction accepted.");
            return true;
        }
    }
    boolean checkSum(Transaction t) {
        if(t.getAmount() >= 1000000) {
            System.out.println("Your transaction is rejected.");
            return true;
        } else {
            return false;
        }
    }

    boolean isFraud(Transaction t) {
        String nameFromBlackList = "Pokemon";
        if (t.getTrader().getFullName().equals(nameFromBlackList)) {
            System.out.println("Your transactions are rejected.");
            return false;
        } else {
            System.out.println("Your transaction accepted.");
            return true;
        }
    }

}
