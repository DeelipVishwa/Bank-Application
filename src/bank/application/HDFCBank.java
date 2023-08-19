package bank.application;

import java.util.UUID;

public class HDFCBank implements  BankInterface {

    // Declared variables what a bank should have!!
    private int balance;
    public String name;
    private String accountNo;
    private String password;
    public static double rateOfInterest;

    public HDFCBank(int balance, String name, String password) {

        this.accountNo = UUID.randomUUID().toString();
        this.balance = balance;
        this.name = name;
        this.password = password;
    }


    @Override
    public int checkBalance(String password) {

        if (password == this.password) {
            return balance;
        } else {
            return -1;
        }
    }

    @Override
    public String addMoney(int money) {
        this.balance += money;

        String message = money + " has been added to the account:" + accountNo + " now the total balance is : " + balance;

        return message;
    }

    @Override
    public String withdrawMoney(int drawMoney, String password) {

        if(password == this.password) {
            if (drawMoney > balance) {
                return "Insuficient Balance";
            } else {
                this.balance -= drawMoney;
                return "Money withdrawn successfully.Remaining balance is now : " + balance;
            }
        } else {
            return "Wrong padsword";
        }
    }

    @Override
    public String changePassword(String oldPassword, String newPassword) {

        if (this.password.equals(oldPassword)) {
            // CompareTo could have also been used.
            this.password = newPassword;
            return "Password has been updated successfully.";
        } else {
            return "Entered wrong password";
        }
    }

    @Override
    public double CalculateRateOfInterest(int year) {
        double interest = (balance * rateOfInterest * year ) / 100;
        return interest;
    }


}
