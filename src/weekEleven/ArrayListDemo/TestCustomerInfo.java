package weekEleven.ArrayListDemo;
import java.util.Scanner;

public class TestCustomerInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SystemManagement info = new SystemManagement();

        while(true){
            System.out.println("Enter in a name or 'q' to quit");
            String input = scanner.nextLine();
            if (input.equals("q")){
                scanner.close();
                info.displayContents();
                break;
            }
            else{
                info.addName(input);
                System.out.printf("Bank ID: ");
                info.addBankID(Integer.parseInt(scanner.nextLine()));
                System.out.printf("Balance: ");
                info.addBalance(Double.parseDouble(scanner.nextLine()));
            }


        }



    }
}
