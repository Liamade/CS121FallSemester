package weekTen.abstractClasses;

public class BankTest {

    public static void main(String[] args) {
        Account accountOne = new SavingsAccount("Leeroy Jenkins",593684,00001,2.75);
        Account accountTwo = new CheckingAccount("Tom Hanks",948.43,17849,10);
        accountOne.displayDetails();
        accountTwo.displayDetails();
    }
}