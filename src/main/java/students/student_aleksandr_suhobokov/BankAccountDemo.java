package students.student_aleksandr_suhobokov;

public class BankAccountDemo {
    public static void main(String[] args) {


        BankAccount aleksandrsBankAccount = new BankAccount("aleksandrs", 0001,1000.00, "Israel");
        BankAccount andreyBankAccount = new BankAccount("andrey", 0002, 800.00, "Latvia");

        aleksandrsBankAccount.checkBalance();
        aleksandrsBankAccount.addMoneyToAccount(400.00);
        aleksandrsBankAccount.checkBalance();
        aleksandrsBankAccount.withdrawMoneyFromAccount(300.00);
        aleksandrsBankAccount.checkBalance();
        aleksandrsBankAccount.withdrawAllMoneyFromAccount();
        aleksandrsBankAccount.checkBalance();
        aleksandrsBankAccount.showAccountInfo();


        int number = 2;
        number = number + 5;
        number += 5; // Eto odinakovo kak 'number = number + 5;'


    }
}
