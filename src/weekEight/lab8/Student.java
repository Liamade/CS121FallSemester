package weekEight.lab8;

public class Student {
    //Declare the Instance Field/Variables/Class member variables
    private String studentName;
    private String major;
    private int studentId;
    private int year;
    private double gpa;

    //CONSTRUCTOR
    public Student(String StudentName, String Major, int StudentID, int Year, double GPA){
        this.studentName = StudentName;
        this.major = Major;
        this.studentId = StudentID;
        this.year = Year;
        this.gpa = GPA;
    }
    //SETTERS
    public void setStudentName(String Name){
        this.studentName = Name;
    }
    public void setStudentId(int studentID){
        this.studentId = studentID;
    }
    public void setMajor(String major){
        this.major = major;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setGpa(double gpa){
        this.gpa = gpa;
    }
    //GETTERS (accessors)
    public String getStudentName(){
        return studentName;
    }
    public int getStudentId(){
        return studentId;
    }
    public String getMajor(){
        return major;
    }
    public int getYear(){
        return year;
    }
    public double getGpa(){
        return gpa;
    }


}
