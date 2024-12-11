package weekTwo;

import javax.swing.JOptionPane;

//Scanner
public class ActivityOneDialogue {
    //main + tab
    public static void main(String[] args) {
        //Declaring variables
        double P,r,A;
        int n,t;
        //P-principal
        //r- annual interest rate
        //n- # of years interest is compounded
        //t- specified number of years
        //A- is the amount of money in account after compounded

        //User Input
        P = Double.parseDouble(JOptionPane.showInputDialog("Enter in the principal amount"));

        r = Double.parseDouble(JOptionPane.showInputDialog("Enter in the annual interest rate"))/100;

        n = Integer.parseInt(JOptionPane.showInputDialog("Enter in the number of times compounded: "));

        t = Integer.parseInt(JOptionPane.showInputDialog("Enter in the years: "));

        // A = P(1+r/n)^nt
        A = P * Math.pow((1+(r/n)),(n*t));

        // %s - string
        // %f - floats
        // %d - integers
        // %c - characters
        JOptionPane.showMessageDialog(null,String.format("The balance " + "Of the account after %d years you have: $ %.2f",t,A));







    }
}
