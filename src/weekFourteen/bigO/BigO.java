package weekFourteen.bigO;

public class BigO {
    //O(1) - Constant Time
    public static void printOneTime(String name){
        System.out.println(name);
    }
    //O(n) - Linear Time
    public static void printNTimes(int n){
        int counter = 1;
        for(int x = 1 ; x <= n ; x++){
            System.out.println("#"+ counter+"\n");
            counter+=1;
        }
    }
    //O(n^2) - Quadratic time - time grows quadratically with input
    public static void printNSquaredTimes(int n){
        int count = 0;
        for(int x = 1 ; x <= n ; x++){
            for(int y = 1 ; y<=n ; y++){
                System.out.println("#"+ (count+1)+":"+"The nested for loop count" + " x" + x + " The magicians" + " y" + y +"\n");
            }
        }
    }


}