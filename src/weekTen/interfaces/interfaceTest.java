package weekTen.interfaces;

public class interfaceTest {
    public static void main(String[] args) {
        Transactionable deposit = new DepositTransaction();
        Transactionable withdraw = new WithdrawTransaction();
        deposit.processTransaction(200);
        deposit.processTransaction(500);
    }
}

