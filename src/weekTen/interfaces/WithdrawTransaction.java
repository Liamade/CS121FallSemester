package weekTen.interfaces;

public class WithdrawTransaction implements Transactionable {
    public void processTransaction(double amount){
        System.out.println("Withdrawing $" + amount);
    }
}
