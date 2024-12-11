package weekEleven.LinkedListActivity;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //variables
        String input;
        //setup scanner
        Scanner scanner = new Scanner(System.in);
        //bank account number 1
        BankAccount one = new BankAccount("Liam",6739,983.43);
        one.addTransaction("Deposit $500");
        one.addTransaction("Withdraw $700");
        one.addTransaction("Deposit $0.71");
        //bank account number 2
        BankAccount two = new BankAccount("Lauren",4948,2000);
        two.addTransaction("Deposit $154");
        two.addTransaction("Withdraw $893");
        two.addTransaction("Deposit $293");
        two.addTransaction("Withdraw $45");
        two.addTransaction("Withdraw $57");
        while(true){
            System.out.println("Enter in Account Name or 'Q' to quit");
            System.out.printf("Account Name: ");
            input = scanner.nextLine();
            //ACCOUNT ONE
            if (input.equals(one.getName())){
                while(true){
                    System.out.println("(PA)-Print Account Info | (PT)-Print Transactions | (R)-Remove Transaction | (RO)-Remove Oldest Transaction | (Q)-Quit");
                    input = scanner.nextLine();
                    if(input.equals("PA")){
                        System.out.println(one.accountInfo());
                    }
                    if(input.equals("PT")){
                        one.displayTransactions();
                    }
                    if(input.equals("R")){
                        System.out.println("Enter Transactions: ");
                        input = scanner.nextLine();
                        for (int x= 0 ; x < one.getSize() ; x++){
                            if (input.equals(one.getTransaction(x))){
                                one.removeTransaction(input);
                                System.out.println("Transaction Removed");

                            }
                        }
                    }
                    if(input.equals("RO")){
                        one.removeOldestTransaction();
                    }
                    if(input.equals("Q")){
                        input = "something";
                        break;
                    }
                }
            }
            //ACCOUNT TWO
            if (input.equals(two.getName())){
                while(true){
                    System.out.println("(PA)-Print Account Info | (PT)-Print Transactions | (R)-Remove Transaction | (RO)-Remove Oldest Transaction | (Q)-Quit");
                    input = scanner.nextLine();
                    if(input.equals("PA")){
                        System.out.println(two.accountInfo());
                    }
                    if(input.equals("PT")){
                        two.displayTransactions();
                    }
                    if(input.equals("R")){
                        System.out.println("Enter Transactions: ");
                        input = scanner.nextLine();
                        for (int x= 0 ; x < one.getSize() ; x++){
                            if (input.equals(two.getTransaction(x))){
                                two.removeTransaction(input);
                                System.out.println("Transaction Removed");
                            }
                        }
                    }
                    if(input.equals("RO")){
                        two.removeOldestTransaction();
                    }
                    if(input.equals("Q")){
                        input= "0";
                        break;
                    }
                }
            }
            //QUIT
            if(input.equals("Q")){
                break;
            }

        }

    }
}
