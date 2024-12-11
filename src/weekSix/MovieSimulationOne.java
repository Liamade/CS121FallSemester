package weekSix;
import java.util.Scanner;

public class MovieSimulationOne {
    public static void main(String[] args) {
        //setup scanner
        Scanner input = new Scanner(System.in);
        //setup arrays
        String [] movieNames;
        String [] movieTypes;
        int [] movieAvailability;
        double [] moviePrice;

        //num movies constant variable
        System.out.printf("how many movies do you wish to compare: ");
        final int numMovies = Integer.parseInt(input.nextLine());
        //initialize array size
        movieNames = new String[numMovies];
        movieTypes = new String[numMovies];
        movieAvailability = new int[numMovies];
        moviePrice = new double[numMovies];


        for  (int x = 0 ; x < numMovies ; x++){
            System.out.printf("Movie %d name: ", (x+1));
            movieNames[x] = input.nextLine();
            System.out.printf("Movie %d type (2D/3D): ", (x+1));
            movieTypes[x] = input.nextLine();
            System.out.printf("Movie %d seat availability: ", (x+1));
            movieAvailability[x] = Integer.parseInt(input.nextLine());
            System.out.printf("Movie %d price: ", (x+1));
            moviePrice[x] = Double.parseDouble(input.nextLine());
        }
        displayMovies(movieNames,movieTypes,movieAvailability,moviePrice);

    }
    public static void displayMovies (String[] mNames,String [] mTypes,int[] mAvailability,double[] mPrice) {

        //movie header
        //%-s --> left aligned
        //%-10s --> 10 spaces left aligned
        //%10s --> right aligned 10 spaces
        String header = String.format("---------------------Movie Details---------------------\n" +
                "%-20s %-20s %-20s %-20s \n","Movie name","Movie Type", "Available Seats", "Price");
        System.out.println(header);
        for (int x=0 ; x < mNames.length ; x++){
            System.out.printf("Movie %d: %-18s %-18s %-18d $%-18.2f \n",(x+1),mNames[x],mTypes[x],mAvailability[x],mPrice[x]);
        }
    }
}
