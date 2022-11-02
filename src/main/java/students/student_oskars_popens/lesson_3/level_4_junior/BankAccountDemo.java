package students.student_oskars_popens.lesson_3.level_4_junior;

class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Oskars", "Popens", 10000.99);
        String ownerFirsName = bankAccount.getOwnerFirstName();
        String ownerLastName = bankAccount.getOwnerLastName();
        double moneyAmount = bankAccount.getMoneyAmount();

        System.out.println("Owners first name - " + ownerFirsName);
        System.out.println("Owners last name - " + ownerLastName);
        System.out.println("Money amount - " + moneyAmount);
    }
}
