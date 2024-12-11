package weekTwelve;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileWrite {
    public static void main(String[] args) throws FileNotFoundException {
        //create two instances
        //file instance
        File outputFile = new File("UserInformation.txt");
        //Print Writer instance
        PrintWriter output = new PrintWriter(outputFile);
        //header
        output.printf("%-20s %-20s %-17s %-20s %-20s","<User Name>","<Password>","<Score>","<Player Character>","<Winning Percentage>");
        //PROMPT THE USER
        for(int x = 1 ; x <= 2 ; x++){
            //name - password - score - playerChar - winningPer
            //declare variables
            String name,playerChar,password;
            int score;
            double winningPer;
            name = JOptionPane.showInputDialog(String.format("Enter user %d's user name: ",x));
            password = JOptionPane.showInputDialog(String.format("Enter user %d's password: ",x));
            playerChar = JOptionPane.showInputDialog(String.format("Enter user %d's Character: ",x));
            score = Integer.parseInt(JOptionPane.showInputDialog(String.format("Enter user %d's score: ",x)));
            winningPer = Double.parseDouble(JOptionPane.showInputDialog(String.format("Enter user %d's winning percentage: ",x)));
            //write into file
            output.printf("\n %-20s %-22s %-22d %-16s %-21.2f",name,password,score,playerChar,winningPer);
        }

        //close out
        output.close();

    }
}
