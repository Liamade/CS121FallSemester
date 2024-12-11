package weekFour;

public class CFTable {
    public static void main(String[] args) {

        //labeling (make it pretty)
        System.out.println("Celsius          Fahrenheit");
        System.out.println("----------------------------");
        //for loop (temps)
        for (int i=0; i <= 20; i++){
            System.out.println(i);
            double fahrenheit = (9.0/5) * i + 32;
            System.out.printf("                 %f \n",fahrenheit);
        }
    }
}
