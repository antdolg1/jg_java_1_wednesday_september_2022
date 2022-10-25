package students.student_aleksandr_suhobokov;

public class BankAccount {

    String owner;
    int accountNumber;
    double moneyAmount;
    String country;
    public BankAccount(String owner, int accountNumber, double moneyAmount, String country) {
        this.owner = owner;
        this.accountNumber = accountNumber;
        this.moneyAmount = moneyAmount;
        this.country = country;

    }

    void addMoneyToAccount(double moneyToAdd) {
    moneyAmount = moneyAmount + moneyToAdd;
    moneyAmount += moneyToAdd;

}
    void withdrawMoneyFromAccount(double moneyToWithdraw) {
        moneyAmount = moneyAmount - moneyToWithdraw;

}


    void checkBalance() {
        System.out.println(owner + " Current balance is: " + moneyAmount);
    }

    void withdrawAllMoneyFromAccount(){
        moneyAmount = 00.00;
    }

    void showAccountInfo() {

        System.out.println(" Account owner : " + owner);
        System.out.println(" Account number : " + accountNumber);
        System.out.println(" Money Amount on account : " + moneyAmount);
        System.out.println(" Owner origin : " + country);


    }




}
