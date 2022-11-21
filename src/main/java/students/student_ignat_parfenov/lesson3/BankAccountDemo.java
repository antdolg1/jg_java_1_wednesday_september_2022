package students.student_ignat_parfenov.lesson3;

public class BankAccountDemo {

    public static void main(String[] args) {

        BankAccount susanBankAccount = new BankAccount("Susan", 1001, 1000.00, "Gemany"  );
        BankAccount johnBankAccount = new BankAccount("John", 2002, 500.00, "Italy");

        susanBankAccount.checkTheBalance();
        susanBankAccount.addMoneyToAccount(100);
        susanBankAccount.checkTheBalance();
        susanBankAccount.withdrawMoneyToAccount(200);
        susanBankAccount.checkTheBalance();
    }
}
