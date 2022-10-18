package students.student_igor_budnitski.lesson_3.homework.level_7.task_32;
/*
* 1 - error - mistake in constructor
* 2 - error - method getMoney has void status, but should be int instead to return a value
* */
class BankAccount {
    String owner;
    int money;

    BankAccount(String owner, int moneyAmount) {
        this.owner = owner;
        this.money = moneyAmount;
    }

    String getOwner() {
        return this.owner;
    }

    int getMoney() {
        return this.money;
    }
}
