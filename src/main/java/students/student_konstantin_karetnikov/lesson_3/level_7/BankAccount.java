package students.student_konstantin_karetnikov.lesson_3.level_7;

class BankAccount {
    String owner;
    String money;

    BankAccount(String owner, String money) {
        this.owner = owner;
        this.money = money;
    }

    String getOwner() {
        return this.owner;
    }

    String getMoney() {
        return this.money;
    }

}
