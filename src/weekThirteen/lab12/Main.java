package weekThirteen.lab12;

public class Main {
    public static void main(String[] args) {
        //create instance of data structure
        DataStructure ds = new DataStructure();

        //NAME
        ds.addName("Liam");
        ds.addName("Lauren");
        ds.addName("John");
        ds.addName("Constantine");
        ds.displayName();
        ds.removeName("Liam");
        ds.displayName();
        //AGE
        ds.addAge(30);
        ds.addAge(24);
        ds.addAge(32);
        ds.addAge(45);
        ds.removeAge();
        ds.displayAge();
        //HOMETOWN
        ds.addHomeTown("Ladoga");
        ds.addHomeTown("Charleston");
        ds.addHomeTown("New York");
        ds.addHomeTown("Stoopidville");
        ds.removeHomeTown("Stoopidville");
        ds.displayHomeTown();
        ds.removeHomeTown("New York");
        ds.displayHomeTown();

        //HOME STATE
        ds.addHomeState("Alabama");
        ds.addHomeState("Canada");
        ds.addHomeState("New Hampshire");
        ds.addHomeState("New York");
        ds.displayHomeState();
        ds.removeHomeState("Alabama");
        ds.displayHomeState();

        //MAJOR AND GPA
        ds.addMajorGpa("Computer Science",2.98);
        ds.addMajorGpa("Doctor",4.0);
        ds.addMajorGpa("Architecture",0.75);
        ds.displayMajorGpa();
        ds.removeMajorGpa("Doctor");
        ds.displayMajorGpa();

        //NATIONALITY
        ds.addNationality("Greek");
        ds.addNationality("American");
        ds.addNationality("French");
        ds.addNationality("Creole");
        ds.displayNationality();
        ds.removeNationality("French");
        ds.displayNationality();



    }
}
