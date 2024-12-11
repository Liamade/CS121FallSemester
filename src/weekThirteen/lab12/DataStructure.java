package weekThirteen.lab12;
import java.util.*;

public class DataStructure {
    private ArrayList<String> studentList = new ArrayList<>();          //student names
    private int[] ageList = new int[3];                                 //student ages
    private int ageIndex = 0;                                           //student age index to keep track where you are
    private HashMap<String, Double> majorGpaMap = new HashMap<>();      //keys: majors  values: GPAs
    private LinkedList<String> nationalityList = new LinkedList<>();    //student nationalities
    private Stack<String> hometownStack = new Stack<>();                //student hometowns
    private Queue<String> homeStateQueue = new LinkedList<>();          //student home states


    public <E> void printArray(E [] inputArray){
        for(E element: inputArray){
            System.out.printf("%s",element);
        }
    }
    //#########NAME#########
    public void addName(String name){
        studentList.add(name);
    }
    public void removeName(String name){
        studentList.remove(name);
    }
    public void displayName(){
        System.out.println("STUDENT NAMES");
        System.out.println("-------------------------");
        for (String name : studentList){
            System.out.printf("\tName: %s\n",name);
        }
        System.out.println();
    }
    //###########AGE###########
    public void addAge(int age){
        if(ageIndex < ageList.length){
            ageList[ageIndex ++] = age;
        }
    }
    public void removeAge(){
        if(ageIndex > 0){
            ageList[-- ageIndex] = 0;
        }
    }
    public void displayAge(){
        System.out.println("STUDENT AGES");
        System.out.println("-------------------------");
        for (int age : ageList){
            System.out.printf("\tAge: %d\n",age);
        }
        System.out.println();
    }
    //#########MAJOR AND GPA################
    public void addMajorGpa(String major,double gpa){
        if (majorGpaMap.containsKey(major)){
            System.out.println("**Major already in List**");
        }else{
            majorGpaMap.put(major,gpa);
        }
    }
    public void removeMajorGpa(String major){
        if (majorGpaMap.containsKey(major)){
            majorGpaMap.remove(major);
        }else{
            System.out.println("Major not Found");
        }
    }
    public void displayMajorGpa(){
        System.out.println("STUDENT MAJORS AND GPAS");
        System.out.println("-------------------------");
        majorGpaMap.forEach((major, gpa) -> {
            System.out.printf("\tMajor: %-20s GPA: %.2f\n",major,gpa);
        });
        System.out.println();
    }

    //#########NATIONALITY LIST###############
    public void addNationality(String nation){
        nationalityList.add(nation);
    }
    public void removeNationality(String nation){
        if(nationalityList.contains(nation)){
            nationalityList.remove(nation);
        }else{
            System.out.printf("List doesn't contain %s\n",nation);
        }
    }
    public void displayNationality(){
        System.out.println("STUDENT NATIONALITIES");
        System.out.println("-------------------------");
        for (String nation : nationalityList){
            System.out.printf("\tNationality: %s\n",nation);
        }
        System.out.println();
    }

    //############HOME TOWN#################
    public void addHomeTown(String town){
        hometownStack.push(town);
    }
    public void removeHomeTown(String town){
        hometownStack.remove(town);
    }
    public void displayHomeTown(){
        System.out.println("STUDENT HOME TOWNS");
        System.out.println("-------------------------");
        for (String town : hometownStack){
            System.out.printf("\tHometown: %s\n",town);
        }
        System.out.println();
    }

    //###########HOME STATE#################
    public void addHomeState(String state){
        homeStateQueue.add(state);
    }
    public void removeHomeState(String state){
        homeStateQueue.remove(state);
    }
    public void displayHomeState(){
        System.out.println("STUDENT HOME STATES");
        System.out.println("-------------------------");
        for (String state : homeStateQueue){
            System.out.printf("\tState: %s\n",state);
        }
        System.out.println();
    }








}
