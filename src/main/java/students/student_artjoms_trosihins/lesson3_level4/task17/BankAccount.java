package students.student_artjoms_trosihins.lesson3_level4.task17;

public class BankAccount {
    String ownerFirstName;
    String ownerLastName;
    double moneyAmount;

    BankAccount(String ownerFirstName, String ownerLastName, double moneyAmount) {
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.moneyAmount = moneyAmount;
    }

    String getOwnerFirstName() {
        return this.ownerFirstName;
    }

    String getOwnerLastName() {
        return this.ownerFirstName;
    }

    double getMoneyAmount() {
        return this.moneyAmount;
    }
}
