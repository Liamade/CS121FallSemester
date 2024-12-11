package Project03;

//WHEN OPEN NEW ACCOUNT
public class Account {
    //VARIABLES
    private final int accountNumber;
    private double balance;
    private final String accountType;
    private String accountName;
    String red = "\033[31m";
    String green = "\033[32m";
    String reset = "\033[0m";

    //CONSTRUCTOR
    public Account(double balance, String accountType, String accountName, int accountNumber){
        this.balance = balance;
        this.accountType = accountType;
        this.accountName = accountName;
        this.accountNumber = accountNumber;

    }

    //GETTERS
    public int getAccountNumber(){
        return this.accountNumber;
    }
    public String getAccountName(){
        return this.accountName;
    }
    public double getBalance(){
        return this.balance;
    }
    public String getAccountType(){
        return this.accountType;
    }

    //Withdraw method
    public void withdraw(double amount){
        if((balance - amount) < 0 ){
            System.out.println(red+"          INSUFFICIENT FUNDS");
        }else {
            this.balance -= amount;
            System.out.printf(green+"     %.2f successfully withdrawn\n",amount);
        }
    }

    //Deposit method
    public void deposit(double amount){
        this.balance += amount;
        System.out.printf(green+"      %.2f successfully deposited\n",amount);
    }


}
