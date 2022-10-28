package students.student_maksims_cerkasovs.lesson_3.lessoncode;

public class BankAccount {

    String owner;
    String accountNumber;
    double moneyAmount;
    String country;

    public BankAccount(String owner, String accountNumber, double moneyAmount, String country) {
        this.owner = owner;
        this.accountNumber = accountNumber;
        this.moneyAmount = moneyAmount;
        this.country = country;
    }

    void addMoneyToAccount(double moneyToAdd) {
        // moneyAmount = moneyAmount + moneyToAdd;
        moneyAmount += moneyToAdd;
    }

    void withdrawMoneyFromAccount(double moneyToWithdraw) {
        moneyAmount = moneyAmount -moneyToWithdraw;
    }

    void checkBalance() {
        System.out.println(owner + " current balance is: " + moneyAmount);
    }

    void withdrawAllMoneyFromAccount() {
        moneyAmount = 0;
    }

    void showAccountInfo() {
        System.out.println("Account owner " + owner);
        System.out.println("Account number " + accountNumber);
        System.out.println("Money amount to account " + moneyAmount);
        System.out.println("Owner origin " + country);
    }

}
