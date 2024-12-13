package weekSixteen.jsonActivity;

public class movieReservation {
    private String name,movie,seatNumber;
    private int reservationNumber;
    private static int instanceCount = 0;

    movieReservation(){
        instanceCount++;
    }
    movieReservation(String name, String seatNumber, String movie){
        this.name = name;
        this.movie = movie;
        this.seatNumber = seatNumber;
        instanceCount++;
    }
    movieReservation(String name, String seatNumber, String movie, int reservationNumber){
        this.name = name;
        this.movie = movie;
        this.seatNumber = seatNumber;
        this.reservationNumber = reservationNumber;
        instanceCount++;
    }


    public int getReservationNumber() {
        return reservationNumber;
    }

    public void setReservationNumber(int reservationNumber) {
        this.reservationNumber = reservationNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }
    public void showDetails(){
        System.out.printf("%s, your movie is %s in seat %s. Reservation Number: %d",this.name,this.movie,this.seatNumber,this.reservationNumber);
    }
}
