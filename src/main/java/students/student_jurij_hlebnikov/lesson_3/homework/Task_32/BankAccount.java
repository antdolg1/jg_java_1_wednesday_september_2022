package students.student_jurij_hlebnikov.lesson_3.homework.Task_32;

class BankAccount {

    String owner;
    int money;

    BankAccount(String owner, int money) {
        this.owner = owner;
        this.money = money;
    }

    String getOwner() {
        return this.owner;
    }

    String getMoney() {
        return String.valueOf(money);
    }

}
