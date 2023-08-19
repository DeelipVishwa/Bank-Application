package bank.application;

import java.time.chrono.HijrahDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.  System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.

        SBI.rateOfInterest = 7;
        HDFCBank.rateOfInterest = 6;


        SBI account1 = new SBI(100000, "Dev","123");

        SBI account2 = new SBI(150000,"Ashish","456");

        HDFCBank account3 = new HDFCBank(200000,"Ankit", "789");


        // Function performed on account1
        int balance = account1.checkBalance("123");
        System.out.println(balance);

        String message = account1.addMoney(50000);
        System.out.println(message);

        String message2 =  account1.withdrawMoney(50000, "123");
        System.out.println(message2);

        String message3 = account1.withdrawMoney(100000, "123");
        System.out.println(message3);

        String message4 = account1.changePassword("123","1164");
        System.out.println(message4);

        String message5 = account1.addMoney(250000);
        System.out.println(message5);

        int checkBalance = account1.checkBalance("1164");
        System.out.println(checkBalance);

        double rateOfInterest = account1.CalculateRateOfInterest(20);
        System.out.println("Total Interest you will get is : " + rateOfInterest);


        // Function performed on account2
        int account2Balance = account2.checkBalance("456");
        System.out.println(account2Balance);



        }
    }
