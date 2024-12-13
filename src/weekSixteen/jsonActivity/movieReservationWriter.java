package weekSixteen.jsonActivity;
import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;

public class movieReservationWriter {
    public static void main(String[] args) {
        try{
            movieReservation movieInfo = new movieReservation("Liam Stuff","45D","jumaji",40284);
            Gson gson = new Gson();

            String jsonString = gson.toJson(movieInfo);
            System.out.println(jsonString);

            FileWriter filewriter = new FileWriter("movieReservation.json");
            filewriter.write(jsonString);
            filewriter.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
