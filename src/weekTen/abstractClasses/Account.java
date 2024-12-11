package weekTen.abstractClasses;

public abstract class Account {
    //setup variables
    protected String accountHolder;
    protected double balance;
    protected int  memberID;

    //DEFAULT CONSTRUCTOR
    public Account(String accountHolder, double balance, int memberID){
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.memberID = memberID;
    }
    //PARAMETERIZED CONSTRUCTOR
    public Account(){
    }







    //SETTER
    public void setAccountHolder(String accountHolder){
        this.accountHolder = accountHolder;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setMemberID(int memberID){
        this.memberID = memberID;
    }

    //GETTER
    public String getAccountHolder(){
        return accountHolder;
    }
    public double getBalance(){
        return balance;
    }
    public int getMemberID(){
        return memberID;
    }
    public void displayDetails(){
        System.out.println(String.format("Name: %s \nMember-ID: %d \nBalance : $%.2f\n",accountHolder,memberID,balance));
    }

}
