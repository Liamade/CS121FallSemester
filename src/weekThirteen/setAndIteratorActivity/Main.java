package weekThirteen.setAndIteratorActivity;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //instance of bank account set
        BankAccountSet accountSet = new BankAccountSet();
        //initialize scanner
        Scanner scnr = new Scanner(System.in);

        //loop for menu
        while(true){
            //MENU
            //Menu Header
            System.out.println("Bank Account Management System");
            System.out.println("-------------------------------");
            //Menu Options
            System.out.println("\t(1) Add a Bank Account ID");
            System.out.println("\t(2) View All Bank Account IDs");
            System.out.println("\t(3) Exit");
            //user input
            System.out.printf(">>");
            String input = scnr.nextLine();

            //switch statement
            switch(input){
                case "1":
                    accountSet.addAccounts();
                    break;
                case "2":
                    accountSet.displayAccounts();
                    break;
                case "3":
                    System.out.println("Exiting System...");
                    scnr.close();
                    return;
                default:
                    System.err.println("**Invalid Response**");
                    System.out.println();
                    break;
            }

        }
    }



}
