package students.student_ilja_morozovs.lesson_3.homework.level_4.Task_17;

class BankAccount {
    String ownerFirstName;
    String ownerSecondName;
    String moneyAmount;

    BankAccount(String ownerFirstName, String ownerSecondName, String moneyAmount) {
        this.ownerFirstName = ownerFirstName;
        this.ownerSecondName = ownerSecondName;
        this.moneyAmount = moneyAmount;
    }

    public String getOwnerFirstName() {
        return ownerFirstName;
    }

    public String getOwnerSecondName() {
        return ownerSecondName;
    }

    public String getMoneyAmount() {
        return moneyAmount;
    }
}
