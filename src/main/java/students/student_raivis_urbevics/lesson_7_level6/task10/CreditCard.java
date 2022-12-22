package students.student_raivis_urbevics.lesson_7_level6.task10;

import java.util.Scanner;

class CreditCard {

    private int cardNumber;

    private String cardName;
    private int pinCode;
    private int balance;

    private int creditLimit;
    private int creditDebt;

    public CreditCard(int cardNumber, int pinCode, int balance, int creditDebt) {
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
        this.balance = 0;
        this.creditDebt = 0;
    }

    private boolean checkPinCode(int pinCode) {
        int count = 1;
        Scanner scanner = new Scanner(System.in);

        while (count < 3) {
            if (this.pinCode == pinCode) {
                System.out.println("Pin Code Correct !");
                System.out.println("Your entered Pin Code = " + pinCode);
                break;
            } else {
                System.out.println("Your entered Pin Code " + pinCode);
                System.out.println(" Your entered Pin Code incorrect ,please try again");
                pinCode = scanner.nextInt();
            }
            count++;
        }

        if (count == 3) {
            System.out.println("Your entered incorrect  Pin Code three times ! ");
            System.out.println("Your Card is BLOCKED!");
            return false;
        } else {
            return true;
        }
    }


    public void depositMoney(int pinCode, int depositAmount) {
        if (checkPinCode(pinCode)) {
            if (creditDebt >= depositAmount) {
                creditDebt = creditDebt - depositAmount;
            } else {
                balance = balance + depositAmount - creditDebt;
                creditDebt = 0;

            }
        }

    }

    public void withDrawMoney(int pinCode, int withDrawAmount) {
        if (checkPinCode(pinCode)) {
            if (balance >= withDrawAmount) {
                balance = balance - withDrawAmount;
            } else {
                int creditSum = withDrawAmount - balance;
                if (creditSum <= creditLimit) {
                    creditDebt = creditSum;
                    balance = 0;
                } else {
                    System.out.println("Credit limit is full,please contact your bank!");
                }
            }
        }
    }


    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public int getCreditDebt() {
        return creditDebt;
    }

    public void setCreditDebt(int creditDebt) {
        this.creditDebt = creditDebt;
    }

    @Override
    public String toString() {
        return "CreditCard [" +
                "cardNumber = " + cardNumber +
                ", cardName = '" + cardName + '\'' +
                ", balance = " + balance +
                ", creditLimit = " + creditLimit +
                ", creditDebt = " + creditDebt +
                ']';
    }
}
