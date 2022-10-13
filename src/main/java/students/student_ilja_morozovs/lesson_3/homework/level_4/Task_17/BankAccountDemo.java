package students.student_ilja_morozovs.lesson_3.homework.level_4.Task_17;

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor", "Savonin", "10000");
        String ownerFirstName = bankAccount.getOwnerFirstName();
        String ownerSecondName = bankAccount.getOwnerSecondName();
        String moneyAmount = bankAccount.getMoneyAmount();
        System.out.println("Owner first name = " + ownerFirstName);
        System.out.println("Owner last name = " + ownerSecondName);
        System.out.println("Money amount = " + moneyAmount);
    }
}
