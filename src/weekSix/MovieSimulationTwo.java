package weekSix;
import java.util.Random;

public class MovieSimulationTwo {
    public static void main(String[] args) {
        String [] movieNames = {"jumanji","matrix","star wars","inception"};
        String [] movieTypes = {"2D","3D","2D","3D"};
        double [] moviePrice = {11.90, 13.40, 15.90, 12.56};
        //constants
        final int ROWS = 5;
        final int COLUMNS = 10;

        //convert to 2D array
        int [][] movieAvailability = new int [ROWS][COLUMNS];

        //call method
        displayMovies(movieNames,movieTypes,moviePrice);
        setSeatAvailability(movieAvailability);
        displaySeatAvailability(movieAvailability);
        randomizedAvailability(movieAvailability);
        displaySeatAvailability(movieAvailability);

    }
    public static void randomizedAvailability (int [][] movieAvailability){
        System.out.println("\n---------------RANDOMIZED SEATS---------------\n");
        Random rand = new Random();
        for (int i = 0; i<movieAvailability.length; i++){
            for (int j = 0; j < movieAvailability[i].length ; j++){
                movieAvailability[i][j] = rand.nextInt(2);
            }
            System.out.println();
        }
    }

    public static void setSeatAvailability (int [][] movieAvailability){
        System.out.println("\n---------------INITIAL SEATS---------------\n");
        for (int i = 0; i<movieAvailability.length; i++){
            for (int j = 0; j < movieAvailability[i].length ; j++){
                movieAvailability[i][j]=0;
            }
            System.out.println();
        }
    }
    //set seat method
    public static void displaySeatAvailability (int [][] movieAvailability){
        System.out.println("\nSeating Availability: [ 1 = unavailable ; 0 = available ]\n");
        for (int i = 0; i<movieAvailability.length; i++){
            for (int j = 0; j < movieAvailability[i].length ; j++){
                System.out.print(movieAvailability[i][j] + " ");
            }
            System.out.println();
        }
    }
    //display method
    public static void displayMovies (String[] mNames,String [] mTypes,double[] mPrice) {
        //movie header
        //%-s --> left aligned
        //%-10s --> 10 spaces left aligned
        //%10s --> right aligned 10 spaces
        String header = String.format("---------------------Movie Details---------------------\n" +
                "%-20s %-20s %-20s \n","Movie name","Movie Type", "Price");
        System.out.println(header);
        for (int x=0 ; x < mNames.length ; x++){
            System.out.printf("Movie %d: %-18s %-18s $%-18.2f \n",(x+1),mNames[x],mTypes[x],mPrice[x]);
        }
    }
}
