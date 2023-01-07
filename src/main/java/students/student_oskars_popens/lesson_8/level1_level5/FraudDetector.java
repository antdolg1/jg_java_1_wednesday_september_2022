package students.student_oskars_popens.lesson_8.level1_level5;

class FraudDetector {

    boolean isFraud(Transaction t){
        // Rule 1 - reject all txns where trader is Pokemon
        if (t.getTrader().getFullName().equals("Pokemon")){
            return true;
        }

        // Rule 2 - reject all txns where amount is over 1000000
        if (t.getAmount() > 1000000){
            return true;
        }

        // Rule 3 - reject all txns where city is Sydney
        if (t.getTrader().getCity().equals("Sydney")){
            return true;
        }

        // Rule 4 - reject all txns where caoutry is Jamaica
        if (t.getTrader().getCountry().equals("Jamaica")){
            return true;
        }

        // Rule 5 - reject all txns from Germany with amount over 1000
        if (t.getTrader().getCountry().equals("Germany") &&
            t.getAmount() > 1000){
            return true;
        }
        return false;
    }
}
