package weekNine;

public class RegularAccount extends bankAccount {
    private int age;

    public RegularAccount(String accountHolder, double balance, int memberID, String accountType, String password, int age){
        super(accountHolder,balance,memberID,accountType,password);
        this.age = age;
    }


    //Setters
    public void setAge(int age){
        this.age = age;
    }


    //Getters
    public int getAge(){
        return age;
    }

    public String toString(){
        return String.format("Name: %s \nMember-ID: %d \nAccount Type: %s \nBalance : $%.2f \nPassword: %s \nAge: %d",accountHolder,memberID,accountType,balance,password,age);
    }
}
