package weekThirteen.setAndIteratorActivity;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Scanner;

public class BankAccountSet {
    //define set
    Set<String> accounts;

    //initializer
    public BankAccountSet(){
        accounts = new HashSet<>();
    }


    //METHODS
    //addAccounts method
    public void addAccounts(){
        //initialize scanner
        Scanner scn = new Scanner(System.in);
        //while loop
        while(true){
            //ask user for IDs or 'q' to quit
            System.out.println("Enter bank account IDs (or enter 'q' to quit)");
            System.out.printf(">>");
            String input = scn.nextLine();
            //check if answer is '0' and quit if it is
            if(input.equals("q")){
                System.out.println("Quiting Program...");
                break;
            }
            //checks if account is already in set
            else if (accounts.contains(input)) {
                System.err.println("**Account Already Added**");

            }
            //adds account to set
            else{
                System.out.println(">>Bank Account Added<<");
                accounts.add(input);
            }
        }
    }

    //displayAccounts method
    public void displayAccounts(){
        //create an iterator
        Iterator<String> iter = accounts.iterator();
        //display header
        System.out.printf("%sBANK ACCOUNTS%s\n","*".repeat(10),"*".repeat(10));
        System.out.printf("%s\n","-".repeat(33));
        //iterator while loop over set
        while(iter.hasNext()){
            //sets account as next account in set
            String account = (String)iter.next();
            //print set
            System.out.printf("\t%s %s\n",">".repeat(2),account);
        }
        //space between stuff
        System.out.println();
    }
}
