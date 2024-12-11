package weekTen.abstractClasses;

public class SavingsAccount extends Account {
    private double APR;

    public SavingsAccount(String accountHolder, double balance, int memberID, double APR){
        super(accountHolder,balance,memberID);
        this.APR = APR;
    }


    //Setters
    public void setcreditLimit(double APR){
        this.APR = APR;
    }


    //Getters
    public double getCreditLimit(){
        return APR;
    }
    @Override
    public void displayDetails(){
        System.out.println(String.format("Name: %s \nMember-ID: %d \nBalance : $%.2f \nAPR: %.2f \n",accountHolder,memberID,balance,APR));
    }
}
