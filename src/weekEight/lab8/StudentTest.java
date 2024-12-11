package weekEight.lab8;

public class StudentTest {
    public static void main(String[] args) {
        Student studentOne = new Student("Liam","being awesome",1372,3,3.999);

        System.out.println("Student Name: " + studentOne.getStudentName());
        System.out.println("Student Major: " + studentOne.getMajor());
        System.out.println("Student ID: " + studentOne.getStudentId());
        System.out.println("Student Year: " + studentOne.getYear());
        System.out.println("Student GPA: " + studentOne.getGpa());

        studentOne.setMajor("computer science");
        studentOne.setGpa(3.67);

        System.out.println(" ");
        System.out.println("UPDATED INFORMATION");
        System.out.println("Student Major: " + studentOne.getMajor());
        System.out.println("Student GPA: " + studentOne.getGpa());


    }
}
