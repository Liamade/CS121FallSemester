package weekNine;

public class main {

    public static void main(String[] args) {

        System.out.println("ACCOUNT #1");
        bankAccount accountOne= new bankAccount("Billy Joel",957.27,11111,"Savings","Password123");
        System.out.println(accountOne);
        System.out.println("ACCOUNT #2");
        bankAccount accountTwo = new RegularAccount("Katy Applebottom",227.54,18392,"Checking","KtApple",25);
        System.out.println(accountTwo);
        System.out.println("ACCOUNT #3");
        bankAccount accountThree = new PremiumAccount("Gilly Heeves",22.36,50274,"Savings","DontHackMePlz",2);
        System.out.println(accountThree);











    }


















}