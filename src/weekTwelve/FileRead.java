package weekTwelve;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) throws FileNotFoundException {
        //INSTANCE OF FILE CLASS
        //Absolute Path
        File fileOne = new File("UserInformation.txt");

        try {
            Scanner console = new Scanner(fileOne);
            String header = console.nextLine();
            System.out.printf("\n%s",header);
            while (console.hasNextLine()) {
                //VARIABLES
                String name = console.next();
                String password = console.next();
                int score = Integer.parseInt(console.next());
                String playerChar = console.next();
                double winningPer = Double.parseDouble(console.next());
                //PRINTING
                System.out.printf("\n %-20s %-22s %-22d %-16s %-21.2f",name,password,score,playerChar,winningPer);

            }
            //close scanner
            console.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }

    }
}

/*  OPTION ONE
---------------------------------------
while(console.hasNextLine()){
    //variables
    String line = console.nextLine();
    System.out.println(line);
        }
---------------------------------------
*/
