package Project03;
import java.io.File;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
public class Bank {
    //array of customers
    private ArrayList<Integer> allPins = new ArrayList<>();
    private ArrayList<Customer> allCustomers = new ArrayList<Customer>();


    //GETTERS
    public ArrayList<Integer> getAllPins(){
        return this.allPins;
    }
    //CUSTOMERS
        //add customer
    public void addCustomer(Customer customer){
        this.allCustomers.add(customer);
    }
        //remove customer
    public void removeCustomer(int pinNumber){
        //append customer from txt file
    }
    public Customer getCustomer(int pin){
        for (Customer customer : allCustomers){
            if(pin == customer.getPin()){
                return customer;
            }
        }
        return null;
    }


    //FILE STUFF
        //load customer pins in files
    public void loadAllPins(){
        String directoryPath = "src\\Project03\\Accounts";    //customer directory
        File directory = new File(directoryPath);   //create object with directory
        File[] accountFiles = directory.listFiles();    //lists all files in directory then puts them in array accountFiles
        if(accountFiles != null){   //add files into allCustomers
            for(File accountNumber : accountFiles){     //for every file in the array
                String fileName = accountNumber.getName();  //get file name
                String fullPinName = getNameWithoutExtension(fileName);     //gets file name without extension
                int pinNumber = Integer.parseInt(fullPinName);     //parse file name into int
                this.allPins.add(pinNumber);    //put pin in allPins array
            }
        }else{
            System.out.println("didn't work");
        }
    }
        //get name of file without extension
    public static String getNameWithoutExtension(String file){
        int dotIndex = file.lastIndexOf('.');
        return (dotIndex == -1)? file : file.substring(0,dotIndex);
    }
        //write to file
    public void writeFile(Customer customer) throws FileNotFoundException {
        File outputFile = new File("src\\Project03\\Accounts\\"+ customer.getPin() + ".txt");
        PrintWriter output = new PrintWriter(outputFile);
        //customer details
        output.printf("%s\n","#".repeat(30));
        output.printf("FirstName: %s\n",customer.getFirstName());       //layout stuff
        output.printf("LastName: %s\n",customer.getLastName());
        output.printf("Password: %s\n",customer.getPassword());
        output.printf("PIN: %d\n",customer.getPin());
        //accounts
        if (customer.getAccountList().isEmpty()){               //checks if customer has accounts
            output.printf("%s","/".repeat(30)); //signals end of file
        }else{
            for(Account account : customer.getAccountList()){           //prints accounts layout for all accounts
                output.printf("%s\n","#".repeat(30));
                output.printf("AccountName: %s\n",account.getAccountName());
                output.printf("AccountType: %s\n",account.getAccountType());
                output.printf("AccountNumber: %d\n",account.getAccountNumber());
                output.printf("Balance: %.2f\n",account.getBalance());
            }
            output.printf("%s","/".repeat(30));
        }
        output.close();
    }
    public Customer loadCustomer(int pinNumber) throws FileNotFoundException {
        //path
        if(this.allPins.contains(pinNumber)){
            try{
                File fileName = new File("src\\Project03\\Accounts\\" + pinNumber + ".txt");
                Scanner console = new Scanner(fileName);
                console.nextLine();                     //get the ### out of the way
                //reads all the content in the personal details part and puts them into variables
                String customerWords[];
                String line = console.nextLine();
                customerWords = line.split(" ");
                String firstName = customerWords[1];
                line = console.nextLine();
                customerWords = line.split(" ");        //probably the most annoying bit of code
                String lastName = customerWords[1];             //i've done ; wanted to use a for loop but i guess
                line = console.nextLine();                      //this is the only way it accepts it and it makes me mad
                customerWords = line.split(" ");
                String password = customerWords[1];
                line = console.nextLine();
                customerWords = line.split(" ");
                int pin = Integer.parseInt(customerWords[1]);
                Customer customer = new Customer(firstName,lastName,password,pin);      //makes customer and adds it
                while(true){                                    //adds all accounts
                    String header = console.nextLine();
                    if(header.equals("/".repeat(30))){      //checks if its the end of the file
                        break;
                    }else{
                        String[] accountWords;      //had to make a new array for idk why
                        line = console.nextLine();
                        accountWords = line.split(" ");         //reads all account info
                        String accountName = accountWords[1];
                        line = console.nextLine();
                        accountWords = line.split(" ");
                        String accountType = accountWords[1];
                        line = console.nextLine();
                        accountWords = line.split(" ");
                        int accountNumber = Integer.parseInt(accountWords[1]);
                        line = console.nextLine();
                        accountWords = line.split(" ");
                        double balance = Double.parseDouble(accountWords[1]);
                        Account account = new Account(balance,accountType,accountName,accountNumber);   //makes account
                        customer.addAccount(account);                                           //add account to customer
                    }
                }
                console.close();
                return customer;
            }catch(FileNotFoundException e){
                System.out.println("didn't work");
            }
        }else{
            System.out.println("didn't work");
        }
        return null;
    }

    public boolean pinCheck(int pin){
        for(int pinNum : this.allPins){
            if(pinNum == pin){
                return true;
            }
        }
        return false;
    }







}
