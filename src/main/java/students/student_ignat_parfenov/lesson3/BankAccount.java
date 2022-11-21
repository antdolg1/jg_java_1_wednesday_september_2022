package students.student_ignat_parfenov.lesson3;

public class BankAccount {

    String owner;
    int accountNumber;
    double moneyAmount;
    String country;

    public BankAccount(String owner, int accountNumber, double moneyAccount, String country) {

        this.owner = owner;
        this.accountNumber = accountNumber;
        this.moneyAmount = moneyAccount;
        this.country = country;
    }

    void addMoneyToAccount(double moneyToAdd) {
        moneyAmount += moneyToAdd;
    }

    void withdrawMoneyToAccount(double moneyToWithdraw) {
        moneyAmount -= moneyToWithdraw;
    }

    void checkTheBalance() {
        System.out.println(owner + " current balance is = " + moneyAmount);
    }
}
