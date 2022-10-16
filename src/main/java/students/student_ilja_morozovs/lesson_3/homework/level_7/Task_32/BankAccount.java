package students.student_ilja_morozovs.lesson_3.homework.level_7.Task_32;

class BankAccount {

    String owner;
    int money;

    public BankAccount(String owner, int money) {
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
