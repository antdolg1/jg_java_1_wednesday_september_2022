package students.student_raivis_urbevics.lesson3_level4.task17;

public class BankAccount {
    String ownerFirstName;
    String ownerLastName;
    int moneyAmount;

    BankAccount(String ownerFirstName,String ownerLastName,int moneyAmount) {
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.moneyAmount = moneyAmount;

        }
        String getOwnerFirstName() {
        return this.ownerFirstName;
    }

        String getOwnerLastName() {
            return this.ownerLastName;
        }

        int getMoneyAmount() {
            return this.moneyAmount;
        }

    }







