package weekEight.lab8;

public class PersonTest {
    public static void main(String[] args) {
        //instantiate the person object
        Person personOne = new Person("John","Doe",45,"110 West Main St",45.00);
        Person personTwo = new Person("Jane","Dukins",57,"111 north hell st",13748373.43);

        personOne.displayPersonContent();
        personTwo.displayPersonContent();

        personOne.lastName = "DoeA";
        personTwo.lastName = "DoeB";
        personOne.setAge(12);
        personTwo.setAge(494739);

        System.out.println(personOne.getAddress());
        System.out.println(personOne.getAge());
        System.out.println(personOne.getSalary());


        personOne.displayAddress();
        personOne.displaySalary();

        personOne.displayPersonContent();
        personTwo.displayPersonContent();
    }
}
