package Project03;

public class Main {
    public static void main(String[] args) {
        Menu main = new Menu();
        try {
            main.mainMenu();        //accountID - 12345
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //password - password
    }
}
