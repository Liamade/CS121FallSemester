package Project03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Menu {
    //instances
    Scanner console = new Scanner(System.in);
    Bank daBank = new Bank();
    //decoration formatting stuff
    String refreshPage = String.format("%s","\n".repeat(30));
    String bold = "\033[1m";
    String reset = "\033[0m";
    String blue = "\033[34m";
    String grey = "\033[37m";
    String black = "\033[30m";
    String green = "\033[32m";
    String red = "\033[31m";


    public void mainMenu() throws InterruptedException {
        while(true){
            daBank.loadAllPins();
            System.out.println(black+ "=========================================");
            System.out.println(reset+"            WELCOME TO DA BANK           ");
            System.out.println(black+"=========================================");
            System.out.println("=========================================");
            System.out.println(blue+"   [1]"+grey+" login");
            System.out.println("   "+blue+"[2]"+grey+" create account");
            System.out.println("   "+blue+"[3]"+grey+" exit");
            System.out.println(black+"=========================================");
            System.out.printf(blue+"   >>> ");
            String input = console.nextLine();
            if (input.equals("1")) {
                //login method
                System.out.println(refreshPage);
                login();
                TimeUnit.SECONDS.sleep(2);
                System.out.println(refreshPage);
            } else if (input.equals("2")) {
                //create account method
                newCustomer();
                System.out.println(refreshPage);
            } else if (input.equals("3")) {
                System.out.println(green+"          Goodbye :(");
                break;

            } else {
                System.out.println(red+bold+"          INVALID SELECTION"+reset);
                TimeUnit.SECONDS.sleep(2);
                System.out.println(refreshPage);
            }
        }
    }
    private void newCustomer() throws InterruptedException {
        System.out.println("                  NEW CUSTOMER");
        System.out.println(black+"===============================================");
        System.out.print(blue+"  First Name: ");
        String firstName = console.nextLine();
        System.out.print("  Last Name: ");
        String lastName = console.nextLine();
        System.out.print("  Password: ");
        String password = console.nextLine();
        int pin;
        do{
            Random rand = new Random();
            pin = 10000 + rand.nextInt(90000);
        }
        while(daBank.pinCheck(pin));
        System.out.printf(grey+"  Account Number:"+blue+" %d\n",pin);
        Customer activeCustomer = new Customer(firstName,lastName,password,pin);
        System.out.println(black+"===============================================");
        System.out.println(blue+"       [O]"+grey+" open customer menu"+blue+" [e]"+grey+" exit");
        System.out.println(black+"===============================================");
        while(true){
            System.out.printf(blue+"   >>> ");
            String input = console.nextLine();
            if(input.equalsIgnoreCase("o")){
                customerMenu(activeCustomer);
                break;
            } else if (input.equalsIgnoreCase("e")) {
                try {
                    daBank.writeFile(activeCustomer);
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                }
                break;
            }
            else{
                System.out.println(red+"            INVALID INPUT");
            }
        }


    }
    private void login() throws InterruptedException {
        //invalid pin boolean
        boolean invalidPin = true;
        //header
        System.out.println(black+"=========================================");
        System.out.println(reset+"                 LOGIN");
        System.out.println(black+"=========================================");
        System.out.println("=========================================");
        System.out.printf(blue+"   ID Number: ");
        //ID number
        String accountIDString = console.nextLine();
        for(int ID : daBank.getAllPins()){                          //check id number
            if(accountIDString.equals(Integer.toString(ID))){
                invalidPin = false;
                int accountID = Integer.parseInt(accountIDString);
                try {
                    Customer activeCustomer = daBank.loadCustomer(accountID);       //load customer
                    daBank.addCustomer(activeCustomer);

                } catch (FileNotFoundException e) {
                    System.out.println();
                    System.err.println(red+"            INVALID PIN"+reset);
                }
                //pull up account method
                Customer activeCustomer = daBank.getCustomer(accountID);
                System.out.print("   Password: ");
                String password = console.nextLine();
                System.out.println(black+"=========================================");
                if(activeCustomer.getPassword().equals(password)){
                    System.out.printf(grey+"                    loading accounts");
                    TimeUnit.MILLISECONDS.sleep(500);
                    System.out.print(".");
                    TimeUnit.MILLISECONDS.sleep(500);
                    System.out.print(".");
                    TimeUnit.MILLISECONDS.sleep(500);
                    System.out.print(".");
                    TimeUnit.MILLISECONDS.sleep(500);
                    System.out.print(".");
                    TimeUnit.MILLISECONDS.sleep(500);
                    customerMenu(activeCustomer);
                    break;
                }else{
                    System.out.println();
                    System.out.println(red+"            INVALID PASSWORD"+reset);
                }
            }
            break;
        }
        if(invalidPin){
            System.out.println();
            System.out.println(red+"            INVALID PIN"+reset);
        }
    }
    private void customerMenu(Customer customer) throws InterruptedException {
        while(true){
            System.out.println(refreshPage);
            System.out.printf(reset+"%s %s\n",customer.getFirstName().toUpperCase(),customer.getLastName().toUpperCase());
            System.out.println(black+"===============================================");
            System.out.println("===============================================");
            for(Account account : customer.getAccountList()){
                String balanceString = String.format("$%.2f",account.getBalance());
                System.out.printf(blue+"%-29s"+green+"%18s\n",account.getAccountName().substring(0, 1).toUpperCase() + account.getAccountName().substring(1),balanceString);
                System.out.println(black+"===============================================");
            }
            System.out.println("  "+blue+"[N]"+grey+" new account "+blue+"[E]"+grey+" exit "+blue+"[c]"+grey+" delete profile");
            System.out.println(reset+"                       or");
            System.out.println(grey+"               type account name");
            System.out.println(black+"===============================================");
            System.out.printf(blue+"   >>>");
            String input = console.nextLine();
            String accountName = customer.checkName(input);
            if(input.equalsIgnoreCase(accountName)){
                //bring up account menu
                accountMenu(customer.getAccountbyName(input));
            } else if (input.equalsIgnoreCase("e")) {
                try {
                    daBank.writeFile(customer);             //saving file
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                }
                System.out.printf(grey+"                           logging out");
                TimeUnit.MILLISECONDS.sleep(500);
                System.out.print(".");
                TimeUnit.MILLISECONDS.sleep(500);
                System.out.print(".");
                TimeUnit.MILLISECONDS.sleep(500);
                System.out.print(".");
                TimeUnit.MILLISECONDS.sleep(500);
                System.out.print(".\n");
                TimeUnit.MILLISECONDS.sleep(500);
                break;
            } else if (input.equalsIgnoreCase("n")) {   //create new account
                Account newAccount = customer.createAccount();
                customer.addAccount(newAccount);

            } else if (input.equalsIgnoreCase("c")) {
                daBank.removeCustomer(customer.getPin());
                File newFile = new File("Accounts\\" + customer.getPin() + ".txt");
                newFile.delete();
                System.out.println(green+"       Profile Deleted :(");
                break;
            } else{
                System.out.println(red+"            INVALID INPUT");
            }
        }
    }
    private void accountMenu(Account account) throws InterruptedException {
        while(true){
            System.out.print(refreshPage);
            System.out.printf(reset+"%-29s"+grey+"%18s\n",account.getAccountName().toUpperCase(),account.getAccountType().toLowerCase());
            System.out.println(black+"===============================================");
            System.out.printf(green+"$%-23.2f"+grey+"Account Number: "+reset+"%d\n",account.getBalance(),account.getAccountNumber());
            System.out.println(black+"===============================================");
            System.out.println(blue+"      [W]"+grey+" withdraw "+blue+"[D]"+grey+" deposit "+blue+"[E]"+grey+" exit");
            System.out.println(black+"===============================================");
            System.out.printf(blue+"   >>>");
            String input = console.nextLine();
            if(input.equalsIgnoreCase("e")) {
                break;
            } else if (input.equalsIgnoreCase("w")) {
                System.out.println();
                System.out.println(reset+"WITHDRAW");
                System.out.println(black+"===============================================");
                while (true) {
                    System.out.print(blue+"   $:  ");
                    if (console.hasNextDouble()) {
                        double money = console.nextDouble();
                        console.nextLine();   //consume last input
                        account.withdraw(money);
                        break;
                    } else {
                        System.out.println(red+"            INVALID INPUT");
                        console.nextLine();  //consume last input
                    }
                }
                TimeUnit.SECONDS.sleep(2);
            } else if (input.equalsIgnoreCase("d")) {
                System.out.println();
                System.out.println(reset+"DEPOSIT");
                System.out.println(black+"===============================================");
                while (true) {
                    System.out.print(blue+"   $:  ");
                    if (console.hasNextDouble()) {
                        double money = console.nextDouble();
                        console.nextLine();  //consume last input
                        account.deposit(money);
                        break;
                    } else {
                        System.out.println(red+"            INVALID INPUT");
                        console.nextLine();  //consumes last input
                        break;
                    }
                }
            } else {
                System.out.println(red+"            INVALID INPUT");
            }
        }
    }


}

