package bank.application;

public interface BankInterface {

    public int checkBalance(String password);

    public String addMoney(int balance);

    public String withdrawMoney(int money, String password);

    public String changePassword(String oldPassword, String newPassword);

    public double CalculateRateOfInterest(int year);


    /*

    // TODO we will try to transfer money within the same bank

     */


}
