package Project03;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Customer {
    //VARIABLES
    private final String firstName;
    private final String lastName;
    private final int pin;
    private final String password;
    private final ArrayList<Account> accountList = new ArrayList<>();
    String blue = "\033[34m";
    String black = "\033[30m";
    String red = "\033[31m";

    //CONSTRUCTOR
    public Customer(String firstName, String lastName, String password, int pin){
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.pin = pin;
    }


    //CUSTOMER DETAILS
        //GETTERS
    public String getFirstName(){
        return this.firstName;
    }
    public String getPassword(){
        return this.password;
    }
    public String getLastName(){
        return this.lastName;
    }
    public int getPin() {
        return this.pin;
    }
    public ArrayList<Account> getAccountList(){
        return this.accountList;
    }


    //ACCOUNTS
        //Add Account
    public void addAccount(Account account){
        this.accountList.add(account);
    }
    public Account getAccountbyName(String name){
        for(Account account : this.accountList){
            if (account.getAccountName().equalsIgnoreCase(name)){
                return account;
            }
        }
        return null;
    }
    public String checkName(String name){
        for(Account account : this.accountList){
            if (account.getAccountName().equalsIgnoreCase(name)){
                return name;
            }
        }
        return null;
    }
        //Get all Accounts
    public ArrayList<Account> getAllAccounts(){
        return this.accountList;
    }
    public Account createAccount(){
        Scanner console = new Scanner(System.in);
        System.out.println("                  NEW ACCOUNT");
        System.out.println(black+"===============================================");
        String accountName;
        while(true){                                                //checks if account name is longer than 1 letter
            System.out.print(blue+"  Account Name: ");
            accountName = console.nextLine();
            if(accountName.length()<2){
                System.out.println(red+"        NAME TOO SHORT");
            }else {
                break;
            }
        }
        System.out.print(blue+"  Account Type (Savings or Checking): ");
        String accountType = console.nextLine();
        double initialDeposit;
        while(true){                                        //checks if input is a double
            System.out.print(blue+"  Initial Deposit: ");
            if(console.hasNextDouble()){
                initialDeposit = console.nextDouble();
                console.nextLine();
                break;
            }else{
                System.out.println(red+"            INVALID INPUT");
                console.nextLine();
            }
        }
        File fileName = new File("src\\Project03\\NumofAccounts.txt");
        int accountNumber;
        try {
            Scanner reading = new Scanner(fileName);
            String readNum = reading.nextLine();
            reading.close();
            accountNumber = Integer.parseInt(readNum) + 1;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            PrintWriter output = new PrintWriter(fileName);
            output.println(accountNumber);
            output.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return new Account(initialDeposit, accountType, accountName, accountNumber);

    }
}
