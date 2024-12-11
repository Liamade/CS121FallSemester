package weekNine;

public class bankAccount {
    //setup varibles
    protected String accountHolder;
    protected double balance;
    protected int  memberID;
    protected String accountType;
    protected String password;

    //CONSTRUCTOR
    public bankAccount(String accountHolder, double balance, int memberID, String accountType, String password){
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.memberID = memberID;
        this.accountType = accountType;
        this.password = password;
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
    public void setAccountType(String accountType){
        this.accountType = accountType;
    }
    public void setPassword(String password){
        this.password = password;
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
    public String getAccountType(){
        return accountType;
    }
    public String getPassword(){
        return password;
    }

    //METHODS
    public String toString(){
        return String.format("Name: %s \nMember-ID: %d \nAccount Type: %s \nBalance: $%.2f \nPassword: %s",accountHolder,memberID,accountType,balance,password);
    }
}
