package weekNine;

public class PremiumAccount extends bankAccount {
    private double creditLimit;

    public PremiumAccount(String accountHolder, double balance, int memberID, String accountType, String password, double creditLimit){
        super(accountHolder,balance,memberID,accountType,password);
        this.creditLimit = creditLimit;
    }


    //Setters
    public void setcreditLimit(int creditLimit){
        this.creditLimit = creditLimit;
    }


    //Getters
    public double getCreditLimit(){
        return creditLimit;
    }

    public String toString(){
        return String.format("Name: %s \nMember-ID: %d \nAccount Type: %s \nBalance : $%.2f \nPassword: %s \nCredit Limit: $%.2f",accountHolder,memberID,accountType,balance,password,creditLimit);
    }

}
