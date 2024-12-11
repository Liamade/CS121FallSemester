package weekEleven.LinkedListActivity;
import java.util.ArrayList;

public class BankAccount {
    private String accountHolderName;
    private int accountNumber;
    private double balance;
    private ArrayList<String> transactions;
    //CONSTRUCTOR
    public BankAccount(String name, int number, double balance){
        this.accountHolderName = name;
        this.accountNumber = number;
        this.balance = balance;
        this.transactions = new ArrayList<>();

    }
    public Integer getSize(){
        return transactions.size();
    }
    public String getTransaction(int number){
        return transactions.get(number);
    }
    public void addTransaction(String trans){
        transactions.add(trans);
    }
    public void removeTransaction(String trans){
        transactions.remove(trans);
    }
    public void removeOldestTransaction(){
        transactions.remove(transactions.getLast());
    }
    public void displayTransactions(){
        System.out.printf("%s's Transactions\n",accountHolderName);
        System.out.println("------------------");
        for (int x = 0 ; x < transactions.size() ; x++){
            System.out.println(transactions.get(x));
        }
    }
    public String accountInfo(){
        return String.format("Name: %s  Account Number: %d  Balance: %.2f",accountHolderName,accountNumber,balance);
    }
    public String getName(){
        return accountHolderName;
    }

}
