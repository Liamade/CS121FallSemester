package weekNine;

import java.util.Scanner;

public class mainTest {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        //variables
        String accountHolder[] = {"Will Orion"};
        int memberID[] = {11111, 11113};
        double balance[] = {1974.57};
        String accountType[] = {"Savings"};
        String bankType[] = {"Regular"};
        int age[] = {45};
        String password[] = {"password"};
        int placement = -1;
        String userInput;
        boolean condition = true;


        //login method
        while (condition){
            //check member-id
            System.out.println("Enter in your MemberID or type 'exit' to leave");
            System.out.printf("MemberID: ");
            userInput = input.nextLine();
            //leaves program
            if (userInput.equals("exit")){
                break;
            }
            //checks in database of member-id's
            else{
                memberID[memberID.length - 1] = Integer.parseInt(userInput);
                for (int x = 0; x <= memberID.length; x++) {
                    if (memberID[memberID.length - 1] == memberID[x]) {
                        placement = x;
                        break;
                    }
                }
                //pulls up account
                bankAccount ActiveAccount = new bankAccount(accountHolder[placement],balance[placement],memberID[placement],accountType[placement],password[placement]);
                //checks password
                while (condition){
                    System.out.printf("Enter your password: ");
                    userInput = input.nextLine();
                    if (userInput.equals(ActiveAccount.getPassword())){
                        //prints out details
                        System.out.println(ActiveAccount);
                        break;
                    }
                    else{
                        System.out.println("Invalid Password Try Again");
                    }
                }





            }


        }
    }
}
