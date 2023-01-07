package students.student_oskars_popens.lesson_7.level_6_middle;

class CreditCard {
    private String pan;
    private int pin;
    private double balance;
    private double creditLimit;
    private double creditBalance;

    CreditCard(String pan, int pin) {
        this.pan = pan;
        this.pin = pin;
        this.creditBalance = 0;
        this.balance = 0;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        if (creditLimit >= 0) {
            this.creditLimit = creditLimit;
        }
    }

    public double getBalance() {
        return balance;
    }


    public double getCreditBalance() {
        return creditBalance;
    }

    public boolean deposit(int pin, double amount) {
        boolean ret = true;

        if (this.pin != pin) {
            System.out.println("Rejected, incorrect PIN code!");
            return false;
        }

        if (this.creditBalance < 0) {
            this.creditBalance += amount;
            if (this.creditBalance > 0){
                this.balance+=this.creditBalance;
                this.creditBalance=0;
            }
        } else {
            this.balance += amount;
        }

        return ret;
    }

    public boolean withdraw(int pin, double amount) {
        boolean ret = true;

        if (this.pin != pin) {
            System.out.println("Rejected, incorrect PIN code!");
            return false;
        }

        if (this.balance+(this.creditLimit-this.creditBalance)<amount){
            System.out.println("Rejected, insufficient funds!");
            return false;
        }

        this.balance-=amount;
        if (this.balance<0){
            this.creditBalance+=this.balance;
            this.balance=0;
        }

        return ret;
    }
}
