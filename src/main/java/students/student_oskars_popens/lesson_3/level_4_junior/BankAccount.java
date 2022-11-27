package students.student_oskars_popens.lesson_3.level_4_junior;

class BankAccount {
    String ownerFirstName;
    String ownerLastName;
    double moneyAmount;

    BankAccount(String ownerFirstName,
                String ownerLastName,
                double moneyAmount) {
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.moneyAmount = moneyAmount;
    }

    String getOwnerFirstName(){
        return this.ownerFirstName;
    }

    String getOwnerLastName() {
        return this.ownerLastName;
    }

    double getMoneyAmount() {
        return this.moneyAmount;
    }
}
