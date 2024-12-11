package weekEleven.ArrayListDemo;
import java.util.ArrayList;

public class SystemManagement {
    private ArrayList<String> names;
    private ArrayList<Double> balances;
    private ArrayList<Integer> bankIDs;

    // CONSTRUCTOR
    public SystemManagement(){
        this.balances = new ArrayList<>();
        this.bankIDs = new ArrayList<>();
        this.names = new ArrayList<>();
    }

    // NAME ARRAY
        //add name
    public void addName(String name){
        names.add(name);
    }
        //remove name
    public void removeName(String name){
        names.remove(name);
    }
        //get size
    public int sizeNames(){
        return names.size();
    }
        //get element by index
    public String indexName(int index){
        return names.get(index);
    }
    // BANKIDS ARRAY
        //add name
    public void addBankID(int bankID){
        bankIDs.add(bankID);
    }
         //remove name
    public void removeBankID(int bankID){
        bankIDs.remove(bankID);
    }
        //get size
    public int sizeBankIDs(){
        return bankIDs.size();
    }
        //get element by index
    public int indexBankIDs(int index){
        return bankIDs.get(index);
    }
    //  BALANCE ARRAY
        //add name
    public void addBalance(double balance){
        balances.add(balance);
    }
        //remove name
    public void removeBankID(double balance){
        balances.remove(balance);
    }
        //get size
    public int sizeBalances(){
        return balances.size();
    }
        //get element by index
    public Double indexBalances(int index){
        return balances.get(index);
    }
    //  DISPLAY CONTENTS
    public void displayContents(){
        System.out.printf("%-10s%-10s%-10s\n","Names","Bank ID","Balance");
        System.out.println("---------------------------");
        for(int x = 0 ; x < names.size() ; x++){
            System.out.printf("%-10s%-10d%-10.2f\n",names.get(x),bankIDs.get(x),balances.get(x));
        }
    }




}
