package weekTwo;
import javax.swing.JOptionPane;

public class WordGame {
    //main + tab
    public static void main(String[] args) {

        //Variable
        String name,city,college,major,animalType,petName;
        int age;

        //User input
        name = (JOptionPane.showInputDialog("Enter in your name"));
        city = (JOptionPane.showInputDialog("Enter in your city"));
        college = (JOptionPane.showInputDialog("Enter in your college"));
        major = (JOptionPane.showInputDialog("Enter in your major"));
        animalType = (JOptionPane.showInputDialog("Enter in your favorite animal"));
        petName = (JOptionPane.showInputDialog("Enter in your pet's name"));
        age = Integer.parseInt(JOptionPane.showInputDialog("Enter in your age"));

        //display
        System.out.printf("There once was an ugly thing named %s who lived in the bad area of town called %s.\n",name,city,age);
        System.out.printf("One day when they became %d years old they decided to go to college called %s to study %s.\n",age,college,major);
        System.out.printf("When going to college they had to forfeit rights to their favorite pets %s which sadly passed away from a %s.\n",petName,animalType);

    }
}
