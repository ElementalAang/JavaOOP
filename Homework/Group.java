package Lesson4.Homework;

import java.util.Arrays;
import java.util.Scanner;

public class Group implements Voenkom{
    public Student[] students = new Student[10];
    public String groupName;
    Scanner s = new Scanner(System.in);

    public Group() {
        super();
        this.students = students;
    }
public Group(String groupName){
        super();
        this.groupName=groupName;
}
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }


    public void addStudent(Student student) throws FullGroupException {
        if(student==null){
            throw new IllegalArgumentException("Null Student");
        }
        for (int i=0;i<students.length;i++){
            if(students[i]==null){
                student.setAcademicGroup(this.groupName);
                students[i]=student;
                return;
            }
        }
        throw new FullGroupException();
    }

    public void addInteractive() throws FullGroupException{
        try {
            String name = getName("Write student name: ");
            String surname = getSurname("Write student surname: ");
            int age = getAge();
            boolean sex = getSex("Write student's gender(man or woman): ");
            int studentID = getStudentID("Write Student ID: ");
            String group = this.groupName;
            Student stud = new Student(name, surname, sex, age, group, studentID);
            this.addStudent(stud);
        }catch (NullPointerException e){
            System.out.println("Error");
            }
        }


    public Student searchStudent(String surname) {
        for (Student student : students) {
            if (student != null && student.getSurname().equals(surname)) {
                return student;
            }
        }
        return null;
    }

    public void delStudent(long number) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null && students[i].getStudentID() == number) {
                students[i] = null;
                return;
            }
        }
    }

    public void sortStudents() {
        for (int i = 0; i < students.length; i++) {
            for (int j = i + 1; j < students.length; j++) {
                if (compareStudents(students[i], students[j]) > 0) {
                    Student t = students[i];
                    students[i] = students[j];
                    students[j] = t;
                }
            }
        }
    }

    public int compareStudents(Student a, Student b) {
        if (a != null && b == null) {
            return 1;
        }
        if (a == null && b == null) {
            return 0;
        }
        if (a == null && b != null) {
            return -1;
        }
        return a.getSurname().compareTo(b.getSurname());
    }

    public int getAge() throws NullPointerException {
        boolean done = false;
        int age = 0;
        for (; !done; ) {
            try {
                age = s.nextInt();
                done = true;
            } catch (NumberFormatException e) {
                System.out.println("Write age by numbers, not symbols");
            }
        }
        return age;
    }

    public String getName(String message) throws NullPointerException {
        boolean done = false;
        String name = "";
        for (; !done; ) {
            try {
                name = s.nextLine();
                done = true;
            } catch (NullPointerException e) {
                System.out.println("Write name by letters, not numbers or symbols");
            }
        }
        return name;
    }

    public String getSurname(String message) throws NullPointerException {
        boolean done = false;
        String surname = "";
        for (; !done; ) {
            try {
                surname = s.nextLine();
                done = true;
            } catch (NullPointerException e) {
                System.out.println("Write name by letters, not numbers or symbols");
            }
        }
        return surname;
    }

    public boolean getSex(String mess)throws NullPointerException{
        boolean done=false;
        boolean gndr=false;
        for(; !done;){
            try {
                gndr=s.next().equals("Man");
                done=true;
            }catch (NumberFormatException e){
                System.out.println("Error. Wrong format");
            }
        }
            return gndr;
    }

    public int getStudentID(String mess) throws NullPointerException {
        boolean done = false;
        int studentID = 0;
        for (; !done; ) {
            try {
                studentID = s.nextInt();
                done = true;
            } catch (NumberFormatException e) {
                System.out.println("Write age by numbers, not symbols");
            }
        }
        return studentID;
    }

    @Override
    public String toString() {
        return "Group{" +
                "students=" + Arrays.toString(students) +
                '}';
    }


    public Student[]militaryList(){
        int q=0;
        for(Student student:students){
            if(student!=null&&student.getAge()>=18){
            q+=1;}
        }
        Student[]militaryArr=new Student[q];
        int w=0;
        for (Student student:this.students){
            if(student!=null &&student.getAge()>=18){
                militaryArr[w++]=student;
            }
        }
        return militaryArr;
}
}

