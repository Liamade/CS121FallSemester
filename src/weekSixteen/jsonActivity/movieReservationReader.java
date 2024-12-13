package weekSixteen.jsonActivity;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class movieReservationReader {
    public static void main(String[] args) {
        try{
            //create a gson
            Gson gson = new Gson();
            //list to hold reservations
            Type movieListType = new TypeToken<List<movieReservation>>(){}.getType();
            //read the json
            File fileName = new File("src/weekSixteen/jsonActivity/movieReservations.json");
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            //movieReservation class equals json converted to gson converted to movieReservation class
            List<movieReservation> movieList = gson.fromJson(reader, movieListType);

            System.out.println("***********Movie Reservation***********");
            for(movieReservation movie : movieList){
                System.out.printf("Customer Name: %s\n",movie.getName());
                System.out.printf("Movie Title: %s\n",movie.getMovie());
                System.out.printf("Seat Number: %s\n",movie.getSeatNumber());
                System.out.printf("Reservation Number: %d\n", movie.getReservationNumber());

            }

        }catch(IOException e){
            e.printStackTrace();

        }
    }
}
