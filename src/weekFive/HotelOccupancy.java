package weekFive;

import java.util.Scanner;
import java.text.DecimalFormat;

public class HotelOccupancy {
    public static void main(String[] args) {
        //setup scanner
        Scanner input = new Scanner(System.in);
        //setup decimal formatting
        DecimalFormat df = new DecimalFormat("#.##");

        //declare variables
        int numFloors = 0, totalRooms = 0, numOccupied = 0, numVacant = 0, numRooms = 0;
        double occupancy, occupancyPercent;

        //ask for number of floors
        System.out.printf("Enter number of floors: ");
        numFloors = Integer.parseInt(input.nextLine());

        //number of rooms per floor
        for (int x = 1; x <= numFloors ; x++){
            System.out.printf("Enter number of rooms in floor %d: ",x);
            numRooms += Integer.parseInt(input.nextLine());
            System.out.printf("Enter number of rooms occupied in floor %d: ",x);
            numOccupied += Integer.parseInt(input.nextLine());
        }

        //calculate variables
        numVacant = (numRooms - numOccupied);
        occupancy = ((double) numVacant /numRooms);
        occupancyPercent = (occupancy*100);

        //print values
        System.out.println("Floors: "+numFloors);
        System.out.println("Rooms: "+numRooms);
        System.out.println("Occupied Rooms: "+numOccupied);
        System.out.println("Vacant Rooms: "+numVacant);
        System.out.println("Occupancy: "+df.format(occupancy) + " ("+df.format(occupancyPercent)+"%)");




    }
}
