package weekSixteen.activity32;


public class Recursion {
    //recursive method to count down from the given amount
    public void countDown(int number){
        //checks if number is 0
        if(number == 0){                        //if number 0 it ends and prints blastoff
            System.out.println("Blast Off!");
            return;    //quits
        }
        System.out.printf("%d....",number);
        //recursion
        countDown(number - 1);

    }
    public void alphaBackwards(char letter){
        //checks if letter is a (at the end)
        if(letter == 'a'){
            System.out.println("|a|");
            return;    //quits
        }
        //print letter
        System.out.printf("|%c",letter);
        //recursion
        alphaBackwards((char)(letter-1));
    }
}
