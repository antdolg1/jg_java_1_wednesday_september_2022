package students.student_maksims_cerkasovs.lesson_3.lessoncode;

public class BankAccountDemo {

    public static void main(String[] args) {

        BankAccount susanBankAccount = new BankAccount("Susan", "0001", 1000.00, "Germany");
        BankAccount johnBankAccount = new BankAccount("John", "0002", 500.00, "Italy");

        susanBankAccount.checkBalance();
        susanBankAccount.addMoneyToAccount(100.00);
        susanBankAccount.checkBalance();
        susanBankAccount.withdrawMoneyFromAccount(500.00);
        susanBankAccount.checkBalance();
        susanBankAccount.withdrawAllMoneyFromAccount();
        susanBankAccount.checkBalance();
        susanBankAccount.showAccountInfo();

    }

}
