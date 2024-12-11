package weekTen.interfaces;

public class DepositTransaction implements Transactionable{
    @Override
    public void processTransaction(double amount){
        System.out.println("Depositing $" + amount);
    }
}

