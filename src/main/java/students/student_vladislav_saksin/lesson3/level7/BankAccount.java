package students.student_vladislav_saksin.lesson3.level7;

public class BankAccount {

    String owner;
    int moneyAmount;


    BankAccount(String owner, int moneyAmount) {
        this.moneyAmount = moneyAmount;
        this.owner = owner;
    }

    String getOwner() {
        return this.owner;
    }

    int getMoney() {
        return this.moneyAmount;
    }
}
