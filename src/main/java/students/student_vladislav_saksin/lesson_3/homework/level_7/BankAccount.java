package students.student_vladislav_saksin.lesson_3.homework.level_7;

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
