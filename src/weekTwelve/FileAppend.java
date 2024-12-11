package weekTwelve;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileAppend{
    public static void main(String[] args) throws IOException {
        try {
            //INSTANCES
            //FileWriter --> (".txt",true)
            FileWriter filewrite = new FileWriter("UserInformation.txt", true);
            //PrintWriter
            PrintWriter output = new PrintWriter(filewrite);
            //VARIABLES
            String name = JOptionPane.showInputDialog("Enter user's username: ");
            String password = JOptionPane.showInputDialog("Enter user's password: ");
            String playerChar = JOptionPane.showInputDialog("Enter user's character: ");
            int score = Integer.parseInt(JOptionPane.showInputDialog("Enter user's score: "));
            double winningPer = Double.parseDouble(JOptionPane.showInputDialog("Enter user's winning percentage: "));

            //Write to file
            output.printf("\n %-20s %-22s %-22d %-16s %-21.2f",name,password,score,playerChar,winningPer);


            //close out both FileWriter and PrintWriter
            filewrite.close();
            output.close();
        }catch(FileNotFoundException e){
            System.err.println("Your File wasn't found");

        }




    }
}
