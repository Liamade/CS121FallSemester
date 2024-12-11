package weekThirteen.stacksAndQueues;

public class Test {
    public static void main(String[] args) {
        //VALID PARENTHESES
        //stacks
        ValidParentheses vp = new ValidParentheses();
        System.out.println(vp.isValid("({[]})"));
        System.out.println(vp.isValid("([)]"));
        //RECENT COUNTER
        RecentCounter rc = new RecentCounter();
        System.out.println(rc.ping(1));
        System.out.println(rc.ping(100));
        System.out.println(rc.ping(3001));
        System.out.println(rc.ping(3002));
    }
}