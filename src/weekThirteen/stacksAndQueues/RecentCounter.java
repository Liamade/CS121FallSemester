package weekThirteen.stacksAndQueues;

import java.util.LinkedList;
import java.util.Queue;

public class RecentCounter {
    private Queue<Integer> queue;

    //INITIALIZER
    public RecentCounter(){
        queue = new LinkedList<>();

    }
    //ping method
    public int ping(int t){
        queue.add(t);
        while(queue.peek() < t - 3000){
            queue.poll();
        }
        return queue.size();
    }
}
