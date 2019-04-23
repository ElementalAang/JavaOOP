package Lesson4.Lesson4;

public class Student extends Human {
    private String AcademicGroup;
    private int StudentID;

    public Student(){
        super();
    }

    public Student( String name, String surname, boolean sex, int age, String AcademicGroup, int StudentID) {
        super();
        this.AcademicGroup=AcademicGroup;
        this.StudentID=StudentID;
    }

    public String getAcademicGroup() {
        return AcademicGroup;
    }

    public void setAcademicGroup(String academicGroup) {
        AcademicGroup = academicGroup;
    }

    public int getStudentID() {
        return StudentID;
    }

    public void setStudentID(int studentID) {
        StudentID = studentID;
    }

    @Override
    public void information(){
        System.out.println("Student: " + getName() + getSurname()+
                "Sex: " +isSex() +
                "Age: "+ getAge() +
                "Academic Group" + getAcademicGroup() +
                "Student ID: " +getStudentID());
    }
}
