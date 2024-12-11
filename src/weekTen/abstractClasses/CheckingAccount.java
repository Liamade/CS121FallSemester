package weekTen.abstractClasses;



public class CheckingAccount extends Account {
    private int withdrawLimit;

    public CheckingAccount(String accountHolder, double balance, int memberID, int withdrawLimit){
        super(accountHolder,balance,memberID);
        this.withdrawLimit = withdrawLimit;
    }


    //Setters
    public void setWithdrawLimit(int withdrawLimit){
        this.withdrawLimit = withdrawLimit;
    }


    //Getters
    public double getWithdrawLimit(){
        return withdrawLimit;
    }
    @Override
    public void displayDetails(){
        System.out.println(String.format("Name: %s \nMember-ID: %d \nBalance : $%.2f \nWithdraw Limit: $%d\n",accountHolder,memberID,balance,withdrawLimit));
    }
}