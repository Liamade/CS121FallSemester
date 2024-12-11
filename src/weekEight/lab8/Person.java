package weekEight.lab8;

public class Person {
    //two public instance fields/variables
    //  public: variable or method can be access anywhere within the program as long as there is an instance of the class
    //      to call it from
    //            person personOne = new Person();
    //            personOne.firstName
    //            personOne.lastName
    //            personOne.age -----> ??
    public String firstName;
    public String lastName;
    //three private instance fields/variables
    //  private: can only be accessed inside the class or through setters and getters
    //      set variables to private unless specified
    private int age;
    private String address;
    private double salary;

    //Constructor: Paramaterized constructor
    //takes in 5 parameters
    public Person(String FirstName, String LastName, int Age, String Address, double Salary){
        //pass in values
        this.firstName = FirstName;
        this.lastName = LastName;
        this.age = Age;
        this.address = Address;
        this.salary = Salary;
    }
    public void displayPersonContent(){
        System.out.printf("Full Name: %s %s \n",firstName,lastName);
        System.out.printf("Age: %d \n",age);
        System.out.printf("Address: %s \n",address);
        System.out.printf("Salary: %.2f \n",salary);
    }
    private void displayAge(){
        System.out.println("Age: " + age);
    }
    //ACCESS MODIFIER: protected
    //      protected: members can only be accessed inside of the class, any class inside of its package
    //        and any of the class's subclass
    protected void displayAddress(){
        System.out.println("Address: " + address);
    }
    //ACCESS MODIFIER: default
    //      default: means access has no keyword; allowed access within the package the class is in
    //        only available in the package in this class
    void displaySalary(){
        System.out.println("Salary: " + salary);
    }
    //SETTERS AND GETTERS

    //SETTERS(mutators)
    public void setAge(int age){
        this.age = age;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    //GETTERS (accessors)
    public int getAge(){
        return age;
    }
    public String getAddress(){
        return address;
    }
    public double getSalary(){
        return salary;
    }



}